package com.yikes.core.pojo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.ToString;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/5 0:07
 */
@Data
@ToString
@ApiModel("数据字典-导出")
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(20)
public class DictExcel {

    @ExcelProperty(value = "诉求编号id", index = 0)
    private Long id;

    @ExcelProperty(value = "上级id", index = 1)
    private Long parentId;

    @ExcelProperty(value = "名称", index = 2)
    private String name;

    @ExcelProperty(value = "值", index = 3)
    private Integer value;

    @ExcelProperty(value = "编码", index = 4)
    private String dictCode;

}
