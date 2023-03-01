package com.yikes.core.service.impl;

import com.yikes.core.pojo.entity.Borrower;
import com.yikes.core.mapper.BorrowerMapper;
import com.yikes.core.service.BorrowerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借款人 服务实现类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Service
public class BorrowerServiceImpl extends ServiceImpl<BorrowerMapper, Borrower> implements BorrowerService {

}
