package com.yikes.core.controller.app;


import com.yikes.common.result.Result;
import com.yikes.core.model.req.BorrowInfoAddReq;
import com.yikes.core.model.req.BorrowInfoEditReq;
import com.yikes.core.model.req.BorrowInfoPageReq;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.yikes.core.service.BorrowInfoService;

import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * 借款信息表
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@RestController
@RequestMapping("core/borrowinfo")
public class BorrowInfoController {

    @Resource
    private BorrowInfoService service;


    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<?> pageInfo(@Valid @RequestBody BorrowInfoPageReq req){

        return Result.ok();
    }


    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<?> get(@RequestParam("id") Long id){

        return Result.ok();
    }


    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody BorrowInfoAddReq req){

        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody BorrowInfoEditReq req){

        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id){

        return Result.ok();
    }

}
