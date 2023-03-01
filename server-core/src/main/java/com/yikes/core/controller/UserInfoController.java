package com.yikes.core.controller;


import com.yikes.core.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户基本信息 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@RestController
@RequestMapping("/core/user_info")
public class UserInfoController {

    @Resource
    private UserInfoService service;


}
