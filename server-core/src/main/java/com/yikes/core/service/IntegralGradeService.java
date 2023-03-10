package com.yikes.core.service;

import com.yikes.base.page.PageResult;
import com.yikes.core.pojo.entity.IntegralGrade;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yikes.core.pojo.req.IntegralGradeAddReq;
import com.yikes.core.pojo.req.IntegralGradeEditReq;
import com.yikes.core.pojo.req.IntegralGradePageReq;
import com.yikes.core.pojo.vo.IntegralGradeVO;

/**
 * <p>
 * 积分等级表 服务类
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
public interface IntegralGradeService extends IService<IntegralGrade> {

    /**
     * 分页
     * @param param
     * @return
     */
    PageResult<IntegralGradeVO> getPageAll(IntegralGradePageReq param);

    /**
     * 根据 id 查询单条数据
     * @param id
     * @return
     */
    IntegralGradeVO get(Long id);

    /**
     * 新增
     * @param param
     */
    void add(IntegralGradeAddReq param);

    /**
     * 编辑
     * @param param
     */
    void edit(IntegralGradeEditReq param);
}
