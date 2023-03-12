package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.BorrowInfo;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yikes.core.mapper.BorrowInfoMapper;
import com.yikes.core.service.BorrowInfoService;


@Service("borrowInfoService")
public class BorrowInfoServiceImpl extends ServiceImpl<BorrowInfoMapper, BorrowInfo> implements BorrowInfoService {


}