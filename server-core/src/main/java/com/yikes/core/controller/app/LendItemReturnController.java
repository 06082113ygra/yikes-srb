package com.yikes.core.controller.app;

import java.util.Arrays;

import com.yikes.common.result.Result;
import com.yikes.core.model.req.LendItemReturnAddReq;
import com.yikes.core.model.req.LendItemReturnEditReq;
import com.yikes.core.model.req.LendItemReturnPageReq;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.yikes.core.service.LendItemReturnService;

import javax.annotation.Resource;
import javax.validation.Valid;



/**
 * 标的出借回款记录表
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@RestController
@RequestMapping("core/lenditemreturn")
public class LendItemReturnController {

    @Resource
    private LendItemReturnService service;


    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<?> pageInfo(@Valid @RequestBody LendItemReturnPageReq req){

        return Result.ok();
    }


    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<?> get(@RequestParam("id") Long id){

        return Result.ok();
    }


    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody LendItemReturnAddReq req){

        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody LendItemReturnEditReq req){

        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id){

        return Result.ok();
    }

}
