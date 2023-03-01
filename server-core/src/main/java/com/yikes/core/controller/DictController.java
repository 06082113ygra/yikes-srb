package com.yikes.core.controller;


import com.yikes.core.service.DictService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "数据字典")
@RestController
@RequestMapping("/core/dict")
public class DictController {

    @Resource
    private DictService service;

}
