package com.yikes.core.controller.app;


import com.yikes.core.service.IntegralGradeService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "积分等级管理")
@RestController
@RequestMapping("/core/integral_grade/app")
public class AppIntegralGradeController {

    @Resource
    private IntegralGradeService service;

}
