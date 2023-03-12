package com.yikes.core.controller.admin;

import com.yikes.common.result.Result;
import com.yikes.core.model.req.UserLoginRecordAddReq;
import com.yikes.core.model.req.UserLoginRecordEditReq;
import com.yikes.core.model.req.UserLoginRecordPageReq;
import com.yikes.core.service.UserLoginRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * 用户登录记录表
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Api(tags = "用户登录记录表")
@RestController
@RequestMapping("/admin/core/userloginrecord")
public class AdminUserLoginRecordController {

    @Resource
    private UserLoginRecordService service;


    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<?> pageInfo(@Valid @RequestBody UserLoginRecordPageReq req){

        return Result.ok();
    }

    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<?> get(@RequestParam("id") Long id){

        return Result.ok();
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody UserLoginRecordAddReq req){

        return Result.ok();
    }

    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody UserLoginRecordEditReq req){

        return Result.ok();
    }

    @ApiOperation("删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id){

        return Result.ok();
    }

}
