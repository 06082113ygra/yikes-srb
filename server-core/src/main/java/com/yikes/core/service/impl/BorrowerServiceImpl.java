package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.Borrower;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.BorrowerMapper;
import com.yikes.core.service.BorrowerService;


@Service("borrowerService")
public class BorrowerServiceImpl extends ServiceImpl<BorrowerMapper, Borrower> implements BorrowerService {


}