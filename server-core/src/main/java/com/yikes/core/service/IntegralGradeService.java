package com.yikes.core.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yikes.base.page.PageResult;
import com.yikes.core.model.req.IntegralGradeAddReq;
import com.yikes.core.model.req.IntegralGradeEditReq;
import com.yikes.core.model.req.IntegralGradePageReq;
import com.yikes.core.model.vo.IntegralGradeVO;
import com.yikes.core.pojo.entity.IntegralGrade;


/**
 * 积分等级表
 *
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
public interface IntegralGradeService extends IService<IntegralGrade> {

    /**
     * 分页
     * @param req
     * @return
     */
    PageResult<IntegralGradeVO> pageInfo(IntegralGradePageReq req);

    /**
     * 根据id查找单条信息
     * @param id
     * @return
     */
    IntegralGradeVO get(Long id);

    /**
     * 新增
     * @param req
     */
    void add(IntegralGradeAddReq req);

    /**
     * 编辑
     * @param req
     */
    void edit(IntegralGradeEditReq req);
}

