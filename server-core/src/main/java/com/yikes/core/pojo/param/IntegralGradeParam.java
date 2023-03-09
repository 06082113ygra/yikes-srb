package com.yikes.core.pojo.param;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 积分等级表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("integral_grade")
@ApiModel(value = "IntegralGrade对象", description = "积分等级表")
public class IntegralGradeParam {


    @ApiModelProperty("编号")
    private Long id;

    @ApiModelProperty("积分区间开始")
    private Integer integralStart;

    @ApiModelProperty("积分区间结束")
    private Integer integralEnd;

    @ApiModelProperty("借款额度")
    private BigDecimal borrowAmount;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;


}
