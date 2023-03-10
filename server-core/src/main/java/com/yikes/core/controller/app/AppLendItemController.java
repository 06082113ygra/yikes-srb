package com.yikes.core.controller.app;


import com.yikes.core.service.LendItemService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 标的出借记录表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "标的出借记录")
@RestController
@RequestMapping("/core/lend_item/app")
public class AppLendItemController {

    @Resource
    private LendItemService service;

}
