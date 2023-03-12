package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.LendItem;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.LendItemMapper;
import com.yikes.core.service.LendItemService;


@Service("lendItemService")
public class LendItemServiceImpl extends ServiceImpl<LendItemMapper, LendItem> implements LendItemService {


}