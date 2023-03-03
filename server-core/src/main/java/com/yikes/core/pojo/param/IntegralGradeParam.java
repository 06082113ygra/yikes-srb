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
public class IntegralGradeParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("积分区间开始")
    @TableField("integral_start")
    private Integer integralStart;

    @ApiModelProperty("积分区间结束")
    @TableField("integral_end")
    private Integer integralEnd;

    @ApiModelProperty("借款额度")
    @TableField("borrow_amount")
    private BigDecimal borrowAmount;

    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty("更新时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty("逻辑删除(1:已删除，0:未删除)")
    @TableField("is_deleted")
    @TableLogic
    private Boolean isDeleted;


}