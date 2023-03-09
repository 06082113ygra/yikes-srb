package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 标的出借记录表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("lend_item")
@ApiModel(value = "LendItem对象", description = "标的出借记录表")
public class LendItem extends BaseEntity {


    @ApiModelProperty("投资编号")
    @TableField("lend_item_no")
    private String lendItemNo;

    @ApiModelProperty("标的id")
    @TableField("lend_id")
    private Long lendId;

    @ApiModelProperty("投资用户id")
    @TableField("invest_user_id")
    private Long investUserId;

    @ApiModelProperty("投资人名称")
    @TableField("invest_name")
    private String investName;

    @ApiModelProperty("投资金额")
    @TableField("invest_amount")
    private BigDecimal investAmount;

    @ApiModelProperty("年化利率")
    @TableField("lend_year_rate")
    private BigDecimal lendYearRate;

    @ApiModelProperty("投资时间")
    @TableField("invest_time")
    private Date investTime;

    @ApiModelProperty("开始日期")
    @TableField("lend_start_date")
    private Date lendStartDate;

    @ApiModelProperty("结束日期")
    @TableField("lend_end_date")
    private Date lendEndDate;

    @ApiModelProperty("预期收益")
    @TableField("expect_amount")
    private BigDecimal expectAmount;

    @ApiModelProperty("实际收益")
    @TableField("real_amount")
    private BigDecimal realAmount;

    @ApiModelProperty("状态（0：默认 1：已支付 2：已还款）")
    @TableField("status")
    private Integer status;


}
