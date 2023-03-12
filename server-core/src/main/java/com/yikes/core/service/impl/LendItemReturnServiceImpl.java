package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.LendItemReturn;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.LendItemReturnMapper;
import com.yikes.core.service.LendItemReturnService;


@Service("lendItemReturnService")
public class LendItemReturnServiceImpl extends ServiceImpl<LendItemReturnMapper, LendItemReturn> implements LendItemReturnService {


}