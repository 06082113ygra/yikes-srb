package com.yikes.core.controller.app;


import com.yikes.core.service.UserBindService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户绑定表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "用户绑定")
@RestController
@RequestMapping("/core/user_bind/app")
public class AppUserBindController {

    @Resource
    private UserBindService service;


}
