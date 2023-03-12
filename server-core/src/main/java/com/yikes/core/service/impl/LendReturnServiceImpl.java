package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.LendReturn;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.LendReturnMapper;
import com.yikes.core.service.LendReturnService;


@Service("lendReturnService")
public class LendReturnServiceImpl extends ServiceImpl<LendReturnMapper, LendReturn> implements LendReturnService {


}