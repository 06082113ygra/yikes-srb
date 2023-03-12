package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.UserInfo;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.UserInfoMapper;
import com.yikes.core.service.UserInfoService;


@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}