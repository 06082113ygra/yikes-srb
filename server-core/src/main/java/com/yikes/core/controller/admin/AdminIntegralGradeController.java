package com.yikes.core.controller.admin;

import com.yikes.base.page.PageResult;
import com.yikes.common.enums.BaseExceptionEnum;
import com.yikes.common.exception.CommonException;
import com.yikes.common.utils.As;
import com.yikes.common.result.Result;
import com.yikes.core.pojo.req.IntegralGradeAddReq;
import com.yikes.core.pojo.req.IntegralGradeEditReq;
import com.yikes.core.pojo.req.IntegralGradePageReq;
import com.yikes.core.pojo.vo.IntegralGradeVO;
import com.yikes.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/2 0:51
 */
@Api(tags = "积分等级管理")
@RestController
@RequestMapping("/core/integral_grade/admin")
public class AdminIntegralGradeController {

    @Resource
    private IntegralGradeService service;

    @ApiOperation("分页-列表")
    @PostMapping("/pageList")
    public Result<PageResult<IntegralGradeVO>> getPageAll(@Valid @RequestBody IntegralGradePageReq req){

        PageResult<IntegralGradeVO> pageAll = service.getPageAll(req);
        return Result.build(pageAll);
    }


    @ApiOperation(value = "根据id删除积分等级")
    @DeleteMapping("/remove")
    protected Result<Void> remove(@RequestParam("id") Long id) {

        boolean remove = service.removeById(id);
        As.isTure(remove, CommonException.build(BaseExceptionEnum.DELETION_FAILURE));
        return Result.ok();
    }

    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<Void> add(@Valid @RequestBody IntegralGradeAddReq req) {

        service.add(req);
        return Result.ok();
    }

    @ApiOperation("编辑积分等级")
    @PutMapping("/edit")
    public Result<Void> edit(@Valid @RequestBody IntegralGradeEditReq req) {

        service.edit(req);
        return Result.ok();
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get")
    public Result<IntegralGradeVO> get(@RequestParam("id") Long id) {

        return Result.ok(service.get(id));
    }

}
