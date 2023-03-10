package com.yikes.core.controller.admin;


import com.yikes.common.result.Result;
import com.yikes.core.pojo.entity.UserLoginRecord;
import com.yikes.core.service.UserLoginRecordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * <p>
 * 用户登录记录表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@RestController
@RequestMapping("/core/user_login_record/admin")
public class AdminUserLoginRecordController {

    @Resource
    private UserLoginRecordService service;


    @ApiOperation("分页-列表")
    @PostMapping("/pageList")
    public Result<?> pageList(@Valid @RequestBody UserLoginRecordPageReq req) {

        return Result.build();
    }

    @ApiOperation(value = "根据id删除积分等级")
    @DeleteMapping("/remove")
    protected Result<?> remove(@RequestParam("id") Long id) {

        return Result.ok();
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody UserLoginRecordAddReq req) {

        return Result.ok();
    }

    @ApiOperation("编辑积分等级")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody UserLoginRecordEditReq req) {

        return Result.ok();
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get")
    protected Result<?> get(@RequestParam("id") Long id) {

        return Result.build();
    }

}
