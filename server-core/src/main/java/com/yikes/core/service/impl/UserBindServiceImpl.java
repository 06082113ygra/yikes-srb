package com.yikes.core.service.impl;

import com.yikes.core.mapper.UserBindMapper;
import com.yikes.core.pojo.entity.UserBind;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yikes.core.service.UserBindService;


@Service("userBindService")
public class UserBindServiceImpl extends ServiceImpl<UserBindMapper, UserBind> implements UserBindService {


}