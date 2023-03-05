package com.yikes.common.utils;

import cn.hutool.core.convert.Convert;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yikes.common.result.Result;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Slf4j
public class ExcelUtils {

    /**
     * 表格导出
     *
     * @param dataList  数据列表
     * @param sheetName sheet页
     * @param fileName  文件名
     * @param tClass    dataList 类型
     * @param response
     * @param <T>
     */
    public static <T> void excelExport(List<T> dataList, String sheetName, String fileName, Class<T> tClass, HttpServletResponse response) {
        try {

            response.setContentType("application/vnd.ms-excel");
            String contentDisposition = "attachment;filename=" + URLEncoder.encode(fileName + ".xlsx", "UTF-8");
            response.setHeader("Content-Disposition", contentDisposition);
            response.setHeader("fileName", URLEncoder.encode(fileName, "UTF-8"));
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition,fileName");

            final ExcelWriter writer = EasyExcelFactory.write(response.getOutputStream(), tClass).autoCloseStream(Boolean.FALSE).build();
            // 使用 EasyExcel 构造 WriteSheet
            final WriteSheet sheet = EasyExcelFactory.writerSheet(sheetName).build();
            writer.write(dataList, sheet);
            writer.finish();
        } catch (Exception e) {
            log.error("excelExport error", e);
            response.setHeader("content-Type", "application/json; charset=utf-8");
            response.setCharacterEncoding("utf-8");
            try {
                response.getWriter().println(JSON.toJSONString(Result.error("system unknown error"), SerializerFeature.valueOf(e.getMessage())));
            } catch (Exception ex) {
                log.error("response.getWriter() error", ex);
            }
        }
    }


    /**
     * 表格导出
     *
     * @param dataList1 数据列表
     * @param dataList2 数据列表
     * @param dataList3 数据列表
     * @param sheetName sheet页
     * @param fileName  文件名
     * @param tClass1   dataList 类型
     * @param tClass2   dataList 类型
     * @param tClass3   dataList 类型
     * @param <T>
     */
    public static <T, R, S> File excelFileExport(List<T> dataList1, List<R> dataList2, List<S> dataList3,
                                                 Class<T> tClass1, Class<R> tClass2, Class<S> tClass3,
                                                 String sheetName, String fileName, String path) {

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        ExcelWriter excelWriter = null;
        try {
            path = path + File.separator + fileName;

            fos = new FileOutputStream(path);
            bos = new BufferedOutputStream(fos);

            excelWriter = EasyExcel.write(bos).excelType(ExcelTypeEnum.XLS).build();

            WriteSheet writeSheet = EasyExcel.writerSheet(sheetName).needHead(Boolean.FALSE).build();

            // 这里必须指定需要头，table 会继承sheet的配置，sheet配置了不需要，table 默认也是不需要
            WriteTable table0 = EasyExcel.writerTable(0).head(tClass1).needHead(Boolean.TRUE).build();
            WriteTable table1 = EasyExcel.writerTable(1).head(tClass2).needHead(Boolean.TRUE).build();
            WriteTable table2 = EasyExcel.writerTable(2).head(tClass3).needHead(Boolean.TRUE).build();

            // 第一次写入会创建头 第一个tab 的头，如果不同的 头类型 需要指定不同的实体
            excelWriter.write(dataList1, writeSheet, table0);
            excelWriter.write(dataList2, writeSheet, table1);
            excelWriter.write(dataList3, writeSheet, table2);

            return new File(path);
        } catch (Exception e) {
            log.info("表格写入数据异常；e: {}", e.getMessage());
            throw new RuntimeException("表格写入数据异常");
        } finally {
            if (excelWriter != null) {
                excelWriter.finish();
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static WriteSheet excelSheet(String fileName, String sheet, HttpServletResponse response) {

        fileName = new String(fileName.getBytes() , StandardCharsets.UTF_8);
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName );

        //设置sheet
        return EasyExcelFactory.writerSheet(0)
                .needHead(Boolean.FALSE)
                .sheetName(sheet)
                .build();

    }

    /**
     * 动态创建表头信息
     * @param headInfo 头部内容
     * @return
     * @author xujiawei
     */
    public static List<List<String>> createHeaderInfo(List<Object> headInfo) {
        List<List<String>> list = new ArrayList<List<String>>();

        //循环头部数据 判断类型
        for(Object info : headInfo){
            List<String> head = new ArrayList<>();//记录头部信息
            Object object = info;

            //判断value类型 字符 数组 集合 (object)
            if(String.class.isAssignableFrom(object.getClass())){
                head.add(Convert.toStr(object));
                list.add(head);
            } else if(object.getClass().isArray()){
                Object[] obs = (Object[]) object;
                for (Object item : obs) {
                    head.add(Convert.toStr(item));
                    list.add(head);
                }
            } else if (Iterable.class.isAssignableFrom(object.getClass())) {
                Iterable iterable = (Iterable) object;
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    Object next = iterator.next();
                    List head1 = new ArrayList<>();
                    head1.add(Convert.toStr(next));
                    list.add(head1);
                }
            }
        }
        return list;
    }

}
