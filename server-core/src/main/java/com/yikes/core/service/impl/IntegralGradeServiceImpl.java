package com.yikes.core.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yikes.core.pojo.entity.IntegralGrade;
import com.yikes.core.mapper.IntegralGradeMapper;
import com.yikes.core.pojo.param.IntegralGradePageParam;
import com.yikes.core.service.IntegralGradeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 积分等级表 服务实现类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Service
public class IntegralGradeServiceImpl extends ServiceImpl<IntegralGradeMapper, IntegralGrade> implements IntegralGradeService {

    @Override
    public List<IntegralGrade> getPageAll(IntegralGradePageParam param) {

        PageHelper.startPage(param.getpn(), param.getps());
        lambdaQuery().eq(ObjectUtil.isNotNull(param.getIntegralStart()), IntegralGrade::getIntegralStart, param.getIntegralStart())
                .eq(ObjectUtil.isNotNull(param.getIntegralEnd()), IntegralGrade::getIntegralEnd, param.getIntegralEnd())
                .ge(ObjectUtil.isNotNull(param.getCreateTime()), IntegralGrade::getCreateTime, param.getCreateTime())
                .le(ObjectUtil.isNotNull(param.getUpdateTime()), IntegralGrade::getUpdateTime, param.getUpdateTime())
                .list();

        return null;
    }
}
