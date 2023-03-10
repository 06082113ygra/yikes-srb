package com.yikes.core.controller.admin;


import com.yikes.common.result.Result;
import com.yikes.core.pojo.entity.UserInfo;
import com.yikes.core.service.UserInfoService;
import com.yikes.core.service.UserIntegralService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * <p>
 * 用户基本信息 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@RestController
@RequestMapping("/core/user_info/admin")
public class AdminUserInfoController {

    @Resource
    private UserInfoService service;


    @ApiOperation("分页-列表")
    @PostMapping("/pageList")
    public Result<?> pageList(@Valid @RequestBody UserInfoPageReq req) {

        return Result.build();
    }

    @ApiOperation(value = "根据id删除积分等级")
    @DeleteMapping("/remove")
    protected Result<?> remove(@RequestParam("id") Long id) {

        return Result.ok();
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody UserInfoAddReq req) {

        return Result.ok();
    }

    @ApiOperation("编辑积分等级")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody UserInfoEditReq req) {

        return Result.ok();
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get")
    protected Result<?> get(@RequestParam("id") Long id) {

        return Result.build();
    }

}
