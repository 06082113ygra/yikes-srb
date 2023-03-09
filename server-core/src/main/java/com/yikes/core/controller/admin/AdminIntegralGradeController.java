package com.yikes.core.controller.admin;

import com.yikes.common.enums.BaseExceptionEnum;
import com.yikes.common.exception.CommonException;
import com.yikes.common.enums.ResultCodeEnum;
import com.yikes.common.utils.Assert;
import com.yikes.common.result.Result;
import com.yikes.common.convert.BeanSuperUtil;
import com.yikes.core.pojo.entity.IntegralGrade;
import com.yikes.core.pojo.param.IntegralGradeParam;
import com.yikes.core.pojo.vo.IntegralGradeVO;
import com.yikes.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/2 0:51
 */
@Api(tags = "积分等级管理")
@RestController
@RequestMapping("/admin/core/integral_grade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService service;

    @ApiOperation("列表")
    @GetMapping("/list")
    public Result<List<IntegralGradeVO>> listAll(){

        List<IntegralGrade> list = service.list();
        List<IntegralGradeVO> beanList = BeanSuperUtil.convertList(list, IntegralGradeVO.class);

        return Result.build(beanList);
    }

    @ApiOperation(value = "根据id删除积分等级", notes="逻辑删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id) {

        boolean remove = service.removeById(id);
        Assert.isTure(remove, CommonException.build(BaseExceptionEnum.DELETION_FAILURE));
        return Result.ok();
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody IntegralGradeParam param) {

        Assert.notNull(param.getBorrowAmount(), ResultCodeEnum.BORROW_AMOUNT_NULL_ERROR);

        boolean save = service.save(BeanSuperUtil.convert(param, IntegralGrade.class));
        Assert.isTure(save, CommonException.build(BaseExceptionEnum.SAVE_FAILURE));
        return Result.ok();
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get")
    public Result<?> getById(@RequestParam("id") Long id) {

        IntegralGrade integralGrade = service.getById(id);
        Assert.isNotNull(integralGrade, CommonException.build(BaseExceptionEnum.DATA_NOT_EXIST));

        return Result.ok(integralGrade);
    }

    @ApiOperation("更新积分等级")
    @PutMapping("/update")
    public Result<?> update(@Valid @RequestBody IntegralGradeParam param) {

        IntegralGrade grade = service.getById(param.getId());
        Assert.isNotNull(grade, CommonException.build(BaseExceptionEnum.DATA_NOT_EXIST));
        service.updateById(BeanSuperUtil.convert(param, IntegralGrade.class));
        return Result.ok();
    }

}
