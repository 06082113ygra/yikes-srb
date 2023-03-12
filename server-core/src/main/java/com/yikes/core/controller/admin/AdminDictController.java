package com.yikes.core.controller.admin;

import com.yikes.common.result.Result;
import com.yikes.core.model.req.DictAddReq;
import com.yikes.core.model.req.DictEditReq;
import com.yikes.core.model.req.DictPageReq;
import com.yikes.core.model.vo.DictVO;
import com.yikes.core.pojo.entity.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import com.yikes.core.service.DictService;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


/**
 * 数据字典
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Api(tags = "数据字典")
@RestController
@RequestMapping("/admin/core/dict")
public class AdminDictController {

    @Resource
    private DictService service;

    @ApiOperation("数据字典-list")
    @GetMapping("/listInfo")
    public Result<List<DictVO>> listInfo() {

        return Result.ok(service.listInfo());
    }


    @ApiOperation("根据上级id获取子节点数据列表")
    @GetMapping("/listByParentId")
    public Result<List<Dict>> listByParentId(@RequestParam(value = "parentId", required = false) Long parentId) {

//        List<Dict> list = service.listByParentId(parentId);
        return Result.ok();
    }


    @ApiOperation("新增")
    @PostMapping("/add")
    public Result<?> add(@Valid @RequestBody DictAddReq req) {

        return Result.ok();
    }


    @ApiOperation("编辑")
    @PutMapping("/edit")
    public Result<?> edit(@Valid @RequestBody DictEditReq req) {

        return Result.ok();
    }


    @ApiOperation("删除")
    @DeleteMapping("/removeDictChild")
    public Result<?> removeDictChild(@RequestParam("id") Long id) {

        service.removeDictChild(id);
        return Result.ok();
    }

    @ApiOperation("数据字典-无返回")
    @GetMapping("/return/getTreeDict")
    public void getTreeDict() {

        service.getTreeDict();
    }

}
