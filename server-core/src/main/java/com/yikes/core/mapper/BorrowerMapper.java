package com.yikes.core.mapper;

import com.yikes.core.pojo.entity.Borrower;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 借款人 Mapper 接口
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Mapper
public interface BorrowerMapper extends BaseMapper<Borrower> {

}
