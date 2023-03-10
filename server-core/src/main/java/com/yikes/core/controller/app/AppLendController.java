package com.yikes.core.controller.app;


import com.yikes.core.service.LendService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 标的准备表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "标的准备")
@RestController
@RequestMapping("/core/lend/app")
public class AppLendController {

    @Resource
    private LendService service;

}
