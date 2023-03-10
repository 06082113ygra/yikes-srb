package com.yikes.core.controller.app;


import com.yikes.core.service.BorrowInfoService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 借款信息表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "借款信息")
@RestController
@RequestMapping("/core/borrow_info/app")
public class AppBorrowInfoController {

    @Resource
    private BorrowInfoService service;

}
