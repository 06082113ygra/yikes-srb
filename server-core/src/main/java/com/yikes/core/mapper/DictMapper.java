package com.yikes.core.mapper;

import com.yikes.core.pojo.dto.ExcelDictDTO;
import com.yikes.core.pojo.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Mapper
public interface DictMapper extends BaseMapper<Dict> {

    // //批量插入
    void insertBatch(List<ExcelDictDTO> list);
}
