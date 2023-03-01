package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.LendReturn;
import com.yikes.core.mapper.LendReturnMapper;
import com.yikes.core.service.LendReturnService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 还款记录表 服务实现类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Service
public class LendReturnServiceImpl extends ServiceImpl<LendReturnMapper, LendReturn> implements LendReturnService {

}
