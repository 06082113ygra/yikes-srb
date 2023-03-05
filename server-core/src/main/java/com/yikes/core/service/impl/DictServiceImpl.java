package com.yikes.core.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.yikes.common.exception.CommonException;
import com.yikes.common.result.Result;
import com.yikes.common.result.ResultCodeEnum;
import com.yikes.common.utils.BeanSuperUtil;
import com.yikes.common.utils.ExcelUtils;
import com.yikes.core.listener.ExcelDictDTOListener;
import com.yikes.core.pojo.dto.ExcelDictDTO;
import com.yikes.core.pojo.entity.Dict;
import com.yikes.core.mapper.DictMapper;
import com.yikes.core.pojo.vo.DictVO;
import com.yikes.core.service.DictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 数据字典 服务实现类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Slf4j
@Transactional(rollbackFor = {Exception.class})
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {

    @Override
    public List<DictVO> listByParentId(Long parentId) {

        List<Dict> list = this.list(new LambdaQueryWrapper<Dict>().eq(Dict::getParentId, parentId).eq(Dict::getIsDeleted, 0));
        List<DictVO> dictVOList = BeanSuperUtil.convertList(list, DictVO.class);

        for (DictVO dictVO : dictVOList) {

            boolean hasChildren = this.hasChildren(dictVO.getParentId());
            dictVO.setHasChildren(hasChildren);
        }

        return dictVOList;
    }

    private boolean hasChildren(Long parentId) {

        long count = this.count(new LambdaQueryWrapper<Dict>().eq(Dict::getParentId, parentId).eq(Dict::getIsDeleted, 0));
        if (count > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Result<CommonException> importData(MultipartFile file) {

        InputStream inputStream;
        try {
            inputStream = file.getInputStream();

            // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
            EasyExcel.read(inputStream, ExcelDictDTO.class, new ExcelDictDTOListener(baseMapper)).sheet().doRead();
            log.info("importData finished");

            return Result.ok(CommonException.build(ResultCodeEnum.BATCH_IMPORT_SUCCEEDED));
        } catch (IOException e) {
            throw new CommonException(ResultCodeEnum.UPLOAD_ERROR);
        }

    }

    @Override
    public void export(HttpServletResponse response) {

        List<Dict> dictList = baseMapper.selectList(null);
        List<ExcelDictDTO> excelDictDTOList = new ArrayList<>(dictList.size());

        for (Dict dict : dictList) {
            ExcelDictDTO toBean = BeanSuperUtil.convert(dict, ExcelDictDTO.class);
            excelDictDTOList.add(toBean);
        }

        String fileName = "数据字典";

        ExcelUtils.excelExport(excelDictDTOList, fileName, fileName, ExcelDictDTO.class, response);
    }
}
