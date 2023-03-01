package com.yikes.core.controller;


import com.yikes.core.service.BorrowerService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 借款人 前端控制器
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Api(tags = "借款人")
@RestController
@RequestMapping("/core/borrower")
public class BorrowerController {

    @Resource
    private BorrowerService service;

}
