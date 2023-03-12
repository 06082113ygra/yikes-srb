package com.yikes.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yikes.core.pojo.entity.UserIntegral;
import org.springframework.stereotype.Service;

import com.yikes.core.mapper.UserIntegralMapper;
import com.yikes.core.service.UserIntegralService;


@Service("userIntegralService")
public class UserIntegralServiceImpl extends ServiceImpl<UserIntegralMapper, UserIntegral> implements UserIntegralService {


}