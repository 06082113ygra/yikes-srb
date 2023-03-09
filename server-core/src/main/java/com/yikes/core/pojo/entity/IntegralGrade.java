package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

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
public class IntegralGrade extends BaseEntity {

    @ApiModelProperty("积分区间开始")
    @TableField("integral_start")
    private Integer integralStart;

    @ApiModelProperty("积分区间结束")
    @TableField("integral_end")
    private Integer integralEnd;

    @ApiModelProperty("借款额度")
    @TableField("borrow_amount")
    private BigDecimal borrowAmount;

}
