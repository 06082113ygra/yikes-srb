package com.yikes.core.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yikes.base.page.PageResult;
import com.yikes.base.util.BeanSuperUtil;
import com.yikes.common.enums.BaseExceptionEnum;
import com.yikes.common.enums.ResultCodeEnum;
import com.yikes.common.exception.CommonException;
import com.yikes.common.utils.As;
import com.yikes.core.model.req.IntegralGradeAddReq;
import com.yikes.core.model.req.IntegralGradeEditReq;
import com.yikes.core.model.req.IntegralGradePageReq;
import com.yikes.core.model.vo.IntegralGradeVO;
import com.yikes.core.pojo.entity.IntegralGrade;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.yikes.core.mapper.IntegralGradeMapper;
import com.yikes.core.service.IntegralGradeService;

import java.util.List;

@Slf4j
@Service("integralGradeService")
public class IntegralGradeServiceImpl extends ServiceImpl<IntegralGradeMapper, IntegralGrade> implements IntegralGradeService {

    @Override
    public PageResult<IntegralGradeVO> pageInfo(IntegralGradePageReq req) {

        PageHelper.startPage(req.getpn(), req.getps());
        List<IntegralGrade> list = lambdaQuery().eq(ObjectUtil.isNotNull(req.getIntegralStart()), IntegralGrade::getIntegralStart, req.getIntegralStart())
                .eq(ObjectUtil.isNotNull(req.getIntegralEnd()), IntegralGrade::getIntegralEnd, req.getIntegralEnd())
                .eq(ObjectUtil.isNotNull(req.getBorrowAmount()), IntegralGrade::getBorrowAmount, req.getBorrowAmount())
                .list();

        return BeanSuperUtil.convertPage(new PageInfo<>(list), IntegralGradeVO.class);
    }

    @Override
    public IntegralGradeVO get(Long id) {

        IntegralGrade grade = getById(id);
        return BeanSuperUtil.convert(grade, IntegralGradeVO.class);
    }

    @Override
    public void add(IntegralGradeAddReq req) {

        As.isNotNull(req.getBorrowAmount(), CommonException.build(ResultCodeEnum.BORROW_AMOUNT_NULL_ERROR));
        save(BeanSuperUtil.convert(req, IntegralGrade.class));
    }

    @Override
    public void edit(IntegralGradeEditReq req) {

        IntegralGrade grade = getById(req.getId());
        As.isNotNull(grade, CommonException.build(BaseExceptionEnum.DATA_NOT_EXIST));

        updateById(BeanSuperUtil.convert(req, IntegralGrade.class));
    }
}