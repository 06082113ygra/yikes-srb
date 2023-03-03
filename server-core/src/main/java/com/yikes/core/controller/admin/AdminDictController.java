package com.yikes.core.controller.admin;


import com.yikes.core.service.DictService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class AdminDictController {

    @Resource
    private DictService service;

}
