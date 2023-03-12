package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.Dict;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.DictMapper;
import com.yikes.core.service.DictService;


@Service("dictService")
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {


}