package com.yikes.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yikes.core.pojo.entity.IntegralGrade;
import org.springframework.stereotype.Service;

import com.yikes.core.mapper.IntegralGradeMapper;
import com.yikes.core.service.IntegralGradeService;


@Service("integralGradeService")
public class IntegralGradeServiceImpl extends ServiceImpl<IntegralGradeMapper, IntegralGrade> implements IntegralGradeService {


}