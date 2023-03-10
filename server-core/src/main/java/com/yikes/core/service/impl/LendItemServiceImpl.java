package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.LendItem;
import com.yikes.core.mapper.LendItemMapper;
import com.yikes.core.service.LendItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标的出借记录表 服务实现类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Service
public class LendItemServiceImpl extends ServiceImpl<LendItemMapper, LendItem> implements LendItemService {

}
