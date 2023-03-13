package com.yikes.core.controller.app;

import java.util.Arrays;

import com.yikes.common.result.Result;
import com.yikes.core.model.req.UserAccountAddReq;
import com.yikes.core.model.req.UserAccountEditReq;
import com.yikes.core.model.req.UserAccountPageReq;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.yikes.core.service.UserAccountService;

import javax.annotation.Resource;
import javax.validation.Valid;



/**
 * 用户账户
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@RestController
@RequestMapping("core/useraccount")
public class UserAccountController {

    @Resource
    private UserAccountService service;

    /**
     * 分页
     */
    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<?> pageInfo(@Valid @RequestBody UserAccountPageReq req){

        return Result.ok();
    }


    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<?> get(@RequestParam("id") Long id){

        return Result.ok();
    }


    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody UserAccountAddReq req){

        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody UserAccountEditReq req){

        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id){

        return Result.ok();
    }

}