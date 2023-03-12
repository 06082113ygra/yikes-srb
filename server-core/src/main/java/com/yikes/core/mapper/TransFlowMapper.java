package com.yikes.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yikes.core.pojo.entity.TransFlow;
import org.apache.ibatis.annotations.Mapper;

/**
 * 交易流水表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Mapper
public interface TransFlowMapper extends BaseMapper<TransFlow> {
	
}
