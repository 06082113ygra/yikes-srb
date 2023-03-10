package com.yikes.core.controller.app;


import com.yikes.core.service.LendReturnService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 还款记录表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "还款记录")
@RestController
@RequestMapping("/core/lend_return/app")
public class AppLendReturnController {

    @Resource
    private LendReturnService service;


}
