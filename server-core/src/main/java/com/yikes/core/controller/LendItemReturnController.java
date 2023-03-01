package com.yikes.core.controller;


import com.yikes.core.service.LendItemService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 标的出借回款记录表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "标的出借回款记录")
@RestController
@RequestMapping("/core/lend_item_return")
public class LendItemReturnController {

    @Resource
    private LendItemService service;

}
