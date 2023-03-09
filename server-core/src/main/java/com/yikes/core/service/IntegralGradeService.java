package com.yikes.core.service;

import com.yikes.base.page.PageResult;
import com.yikes.core.pojo.entity.IntegralGrade;
import com.baomidou.mybatisplus.extension.service.IService;
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
     * 分页信息
     * @param param
     * @return
     */
    PageResult<IntegralGradeVO> getPageAll(IntegralGradePageParam param);
}
