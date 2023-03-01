package com.yikes.core.controller;


import com.yikes.core.service.UserIntegralService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户积分记录表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "用户积分记录")
@RestController
@RequestMapping("/core/user_integral")
public class UserIntegralController {

    @Resource
    private UserIntegralService service;

}
