package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.BorrowerAttach;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.BorrowerAttachMapper;
import com.yikes.core.service.BorrowerAttachService;


@Service("borrowerAttachService")
public class BorrowerAttachServiceImpl extends ServiceImpl<BorrowerAttachMapper, BorrowerAttach> implements BorrowerAttachService {


}