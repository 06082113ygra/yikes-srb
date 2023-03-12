package com.yikes.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yikes.core.pojo.entity.IntegralGrade;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分等级表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Mapper
public interface IntegralGradeMapper extends BaseMapper<IntegralGrade> {
	
}
