package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.TransFlow;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.TransFlowMapper;
import com.yikes.core.service.TransFlowService;


@Service("transFlowService")
public class TransFlowServiceImpl extends ServiceImpl<TransFlowMapper, TransFlow> implements TransFlowService {


}