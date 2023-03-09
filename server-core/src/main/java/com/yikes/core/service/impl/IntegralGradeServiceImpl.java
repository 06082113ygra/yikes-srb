package com.yikes.core.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yikes.base.page.PageResult;
import com.yikes.base.util.BeanSuperUtil;
import com.yikes.core.pojo.entity.IntegralGrade;
import com.yikes.core.mapper.IntegralGradeMapper;
import com.yikes.core.pojo.param.IntegralGradePageParam;
import com.yikes.core.pojo.vo.IntegralGradeVO;
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
    public PageResult<IntegralGradeVO> getPageAll(IntegralGradePageParam param) {

        PageHelper.startPage(param.getpn(), param.getps());
        List<IntegralGrade> list = lambdaQuery().eq(ObjectUtil.isNotNull(param.getIntegralStart()), IntegralGrade::getIntegralStart, param.getIntegralStart())
                .eq(ObjectUtil.isNotNull(param.getIntegralEnd()), IntegralGrade::getIntegralEnd, param.getIntegralEnd())
                .ge(ObjectUtil.isNotNull(param.getCreateTime()), IntegralGrade::getCreateTime, param.getCreateTime())
                .le(ObjectUtil.isNotNull(param.getUpdateTime()), IntegralGrade::getUpdateTime, param.getUpdateTime())
                .list();

        PageInfo<IntegralGrade> pageInfo = new PageInfo<>(list);
        PageResult<IntegralGradeVO> pageResult = BeanSuperUtil.convertPage(pageInfo, IntegralGradeVO.class);

        return pageResult;
    }
}
