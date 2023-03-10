package com.yikes.core.controller.app;


import com.yikes.core.service.UserLoginRecordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户登录记录表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@RestController
@RequestMapping("/core/user_login_record/app")
public class AppUserLoginRecordController {

    @Resource
    private UserLoginRecordService service;

}
