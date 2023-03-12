package com.yikes.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yikes.core.pojo.entity.UserAccount;
import org.springframework.stereotype.Service;
import java.util.Map;

import com.yikes.core.mapper.UserAccountMapper;
import com.yikes.core.service.UserAccountService;


@Service("userAccountService")
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {


}