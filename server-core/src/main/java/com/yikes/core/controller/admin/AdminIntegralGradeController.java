package com.yikes.core.controller.admin;

import com.yikes.base.page.PageResult;
import com.yikes.common.result.Result;
import com.yikes.core.model.req.IntegralGradeAddReq;
import com.yikes.core.model.req.IntegralGradeEditReq;
import com.yikes.core.model.req.IntegralGradePageReq;
import com.yikes.core.model.vo.IntegralGradeVO;
import io.swagger.annotations.Api;
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
@Api(tags = "积分等级表")
@RestController
@RequestMapping("/admin/core/integralgrade")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService service;


    @ApiOperation("分页")
    @PostMapping("/pageInfo")
    public Result<PageResult<IntegralGradeVO>> pageInfo(@Valid @RequestBody IntegralGradePageReq req){

        return Result.ok(service.pageInfo(req));
    }

    @ApiOperation("信息")
    @GetMapping("/get")
    public Result<IntegralGradeVO> get(@RequestParam("id") Long id){

        return Result.ok(service.get(id));
    }


    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<Void> add(@Valid @RequestBody IntegralGradeAddReq req){

        service.add(req);
        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<Void> edit(@Valid @RequestBody IntegralGradeEditReq req){

        service.edit(req);
        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/remove")
    protected Result<Void> remove(@RequestParam("id") Long id){

        service.removeById(id);
        return Result.ok();
    }

}
