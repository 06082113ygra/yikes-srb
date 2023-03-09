package com.yikes.core.service;

import com.yikes.base.page.PageResult;
import com.yikes.core.pojo.entity.IntegralGrade;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yikes.core.pojo.param.IntegralGradeAddParam;
import com.yikes.core.pojo.param.IntegralGradeEditParam;
import com.yikes.core.pojo.param.IntegralGradePageParam;
import com.yikes.core.pojo.vo.IntegralGradeVO;

import java.util.List;

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
    PageResult<IntegralGradeVO> getPageAll(IntegralGradePageParam param);

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
    void add(IntegralGradeAddParam param);

    /**
     * 编辑
     * @param param
     */
    void edit(IntegralGradeEditParam param);
}
