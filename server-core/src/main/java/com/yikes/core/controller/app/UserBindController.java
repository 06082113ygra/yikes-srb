package com.yikes.core.controller.app;

import com.yikes.common.result.Result;
import com.yikes.core.model.req.UserBindAddReq;
import com.yikes.core.model.req.UserBindEditReq;
import com.yikes.core.model.req.UserBindPageReq;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import com.yikes.core.service.UserBindService;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 用户绑定表
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@RestController
@RequestMapping("core/userbind")
public class UserBindController {

    @Resource
    private UserBindService service;


    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<?> pageInfo(@Valid @RequestBody UserBindPageReq req){

        return Result.ok();
    }


    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<?> get(@RequestParam("id") Long id){

        return Result.ok();
    }


    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody UserBindAddReq req){

        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody UserBindEditReq req){

        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/remove")
    public Result<?> remove(@RequestParam("id") Long id){

        return Result.ok();
    }

}
