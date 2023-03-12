package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.Lend;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.LendMapper;
import com.yikes.core.service.LendService;


@Service("lendService")
public class LendServiceImpl extends ServiceImpl<LendMapper, Lend> implements LendService {


}