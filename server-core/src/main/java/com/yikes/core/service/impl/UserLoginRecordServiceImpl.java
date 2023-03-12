package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.UserLoginRecord;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.UserLoginRecordMapper;
import com.yikes.core.service.UserLoginRecordService;


@Service("userLoginRecordService")
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {



}