package com.yikes.core.controller.app;

import java.util.Arrays;

import com.yikes.common.result.Result;
import com.yikes.core.model.req.IntegralGradeAddReq;
import com.yikes.core.model.req.IntegralGradeEditReq;
import com.yikes.core.model.req.IntegralGradePageReq;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.yikes.core.service.IntegralGradeService;

import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * 积分等级表
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@RestController
@RequestMapping("core/integralgrade")
public class IntegralGradeController {

    @Resource
    private IntegralGradeService integralGradeService;


    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<?> pageInfo(@Valid @RequestBody IntegralGradePageReq req){

        return Result.ok();
    }


    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<?> get(@RequestParam("id") Long id){

        return Result.ok();
    }


    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody IntegralGradeAddReq req){

        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody IntegralGradeEditReq req){

        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id){

        return Result.ok();
    }

}
