package com.yikes.core.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yikes.base.page.PageResult;
import com.yikes.base.util.BeanSuperUtil;
import com.yikes.common.enums.BaseExceptionEnum;
import com.yikes.common.enums.ResultCodeEnum;
import com.yikes.common.exception.CommonException;
import com.yikes.common.utils.As;
import com.yikes.core.pojo.entity.IntegralGrade;
import com.yikes.core.mapper.IntegralGradeMapper;
import com.yikes.core.pojo.param.IntegralGradeAddParam;
import com.yikes.core.pojo.param.IntegralGradeEditParam;
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
        List<IntegralGrade> list = lambdaQuery()
                .eq(IntegralGrade::getIsDeleted, Boolean.TRUE)
                .eq(ObjectUtil.isNotNull(param.getIntegralStart()), IntegralGrade::getIntegralStart, param.getIntegralStart())
                .eq(ObjectUtil.isNotNull(param.getIntegralEnd()), IntegralGrade::getIntegralEnd, param.getIntegralEnd())
                .ge(ObjectUtil.isNotNull(param.getCreateTime()), IntegralGrade::getCreateTime, param.getCreateTime())
                .le(ObjectUtil.isNotNull(param.getUpdateTime()), IntegralGrade::getUpdateTime, param.getUpdateTime())
                .list();

        PageInfo<IntegralGrade> pageInfo = new PageInfo<>(list);
        PageResult<IntegralGradeVO> pageResult = BeanSuperUtil.convertPage(pageInfo, IntegralGradeVO.class);

        return pageResult;
    }

    @Override
    public void add(IntegralGradeAddParam param) {

        As.notNull(param.getBorrowAmount(), ResultCodeEnum.BORROW_AMOUNT_NULL_ERROR);
        save(BeanSuperUtil.convert(param, IntegralGrade.class));
    }

    @Override
    public void edit(IntegralGradeEditParam param) {

        IntegralGrade grade = getById(param.getId());
        As.isNotNull(grade, CommonException.build(BaseExceptionEnum.DATA_NOT_EXIST));

        BeanSuperUtil.convert(param, IntegralGrade.class);
    }

    @Override
    public IntegralGradeVO get(Long id) {

        IntegralGrade grade = getById(id);
        As.isNotNull(grade, CommonException.build(BaseExceptionEnum.DATA_NOT_EXIST));

        return BeanSuperUtil.convert(grade, IntegralGradeVO.class);
    }
}
