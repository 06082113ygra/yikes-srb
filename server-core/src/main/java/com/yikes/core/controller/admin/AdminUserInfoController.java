package com.yikes.core.controller.admin;

import com.yikes.common.result.Result;
import com.yikes.core.model.req.UserInfoAddReq;
import com.yikes.core.model.req.UserInfoEditReq;
import com.yikes.core.model.req.UserInfoPageReq;
import com.yikes.core.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * 用户基本信息
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Api(tags = "用户基本信息")
@RestController
@RequestMapping("/admin/core/userinfo")
public class AdminUserInfoController {

    @Resource
    private UserInfoService service;


    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<?> pageInfo(@Valid @RequestBody UserInfoPageReq req){

        return Result.ok();
    }


    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<?> get(@RequestParam("id") Long id){

        return Result.ok();
    }


    @ApiOperation("信息")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody UserInfoAddReq req){

        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody UserInfoEditReq req){

        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id){

        return Result.ok();
    }

}
