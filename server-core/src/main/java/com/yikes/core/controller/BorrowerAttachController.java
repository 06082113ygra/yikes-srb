package com.yikes.core.controller;


import com.yikes.core.service.BorrowerAttachService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 借款人上传资源表 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "借款人上传资源")
@RestController
@RequestMapping("/core/borrower_attach")
public class BorrowerAttachController {

    @Resource
    private BorrowerAttachService service;

//    @ApiOperation("")

}
