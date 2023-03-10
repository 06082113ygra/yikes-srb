package com.yikes.core.controller.app;


import com.yikes.core.service.TransFlowService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 交易流水表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "交易流水")
@RestController
@RequestMapping("/core/trans_flow/app")
public class AppTransFlowController {

    @Resource
    private TransFlowService service;

}
