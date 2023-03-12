package com.yikes.core.controller.admin;


import com.yikes.common.result.Result;
import com.yikes.core.model.req.BorrowerAttachAddReq;
import com.yikes.core.model.req.BorrowerAttachEditReq;
import com.yikes.core.model.req.BorrowerAttachPageReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.yikes.core.service.BorrowerAttachService;

import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * 借款人上传资源表
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Api(tags = "借款人上传资源表")
@RestController
@RequestMapping("/admin/core/borrowerattach")
public class AdminBorrowerAttachController {

    @Resource
    private BorrowerAttachService service;


    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<?> pageInfo(@Valid @RequestBody BorrowerAttachPageReq req){

        return Result.ok();
    }


    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<?> get(@RequestParam("id") Long id){

        return Result.ok();
    }


    @ApiOperation("新增")
    @RequestMapping("/add")
    public Result<?> add(@Valid @RequestBody BorrowerAttachAddReq req){

        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody BorrowerAttachEditReq req){

        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/remove")
    protected Result<?> remove(@RequestParam("id") Long id){

        return Result.ok();
    }

}
