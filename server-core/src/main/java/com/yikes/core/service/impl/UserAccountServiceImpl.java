package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.UserAccount;
import com.yikes.core.mapper.UserAccountMapper;
import com.yikes.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
