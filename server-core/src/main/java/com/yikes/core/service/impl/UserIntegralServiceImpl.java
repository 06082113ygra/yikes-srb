package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.UserIntegral;
import com.yikes.core.mapper.UserIntegralMapper;
import com.yikes.core.service.UserIntegralService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户积分记录表 服务实现类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Service
public class UserIntegralServiceImpl extends ServiceImpl<UserIntegralMapper, UserIntegral> implements UserIntegralService {

}
