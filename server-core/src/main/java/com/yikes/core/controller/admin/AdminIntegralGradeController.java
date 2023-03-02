package com.yikes.core.controller.admin;

import cn.hutool.core.util.ObjectUtil;
import com.yikes.common.utils.Assert;
import com.yikes.common.result.Result;
import com.yikes.common.result.ResultCodeEnum;
import com.yikes.core.pojo.entity.IntegralGrade;
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
 * @description: TODO
 */
@Api(tags = "积分等级管理")
@RestController
@RequestMapping("/admin/core/integral_grade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService service;

    @ApiOperation("列表")
    @GetMapping("/list")
    public Result<List<IntegralGrade>> listAll(){

        return Result.build(service.list());
    }

    @ApiOperation(value = "根据id删除积分等级", notes="逻辑删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id) {
        boolean remove = service.removeById(id);

        if (remove) {
            return Result.ok().message("删除成功");
        } else {
            return Result.error().message("删除失败");
        }
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody IntegralGrade integralGrade) {

        Assert.notNull(integralGrade.getBorrowAmount(), ResultCodeEnum.BORROW_AMOUNT_NULL_ERROR);

        boolean save = service.save(integralGrade);
        if (save) {
            return Result.ok().message("保存成功");
        } else {
            return Result.error().message("保存失败");
        }
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get")
    public Result<?> getById(@RequestParam("id") Long id) {

        IntegralGrade integralGrade = service.getById(id);
        if (ObjectUtil.isNotEmpty(integralGrade)) {

            return Result.ok(integralGrade);
        } else {
            return Result.error().message("数据不存在");
        }
    }

    @ApiOperation("更新积分等级")
    @PutMapping("/update")
    public Result<?> update(@Valid @RequestBody IntegralGrade integralGrade) {

        boolean update = service.updateById(integralGrade);
        if (update) {
            return Result.ok().message("修改成功");
        } else {
            return Result.error().message("修改失败");
        }
    }

}
