package com.yikes.core.controller.admin;


import com.yikes.common.result.Result;
import com.yikes.core.pojo.vo.DictVO;
import com.yikes.core.service.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Slf4j
@Api(tags = "数据字典")
@RestController
@RequestMapping("/core/dict")
public class AdminDictController {

    @Resource
    private DictService dictService;

    @ApiOperation("根据上级id获取子节点数据列表")
    @GetMapping("/listByParentId")
    public Result<List<DictVO>> listByParentId(@RequestParam(value = "parentId") Long parentId) {

        List<DictVO> list = dictService.listByParentId(parentId);
        return Result.build(list);
    }

    @ApiOperation("Excel批量导入数据字典")
    @PostMapping("/import")
    public Result<?> batchImport(@ApiParam(value = "Excel文件", required = true)
                                     @RequestPart("file") MultipartFile file) {

        return Result.build(dictService.importData(file));
    }

    @ApiOperation("Excel数据的导出")
    @PostMapping("/export")
    public void export(HttpServletResponse response) {

        dictService.export(response);
    }

}
