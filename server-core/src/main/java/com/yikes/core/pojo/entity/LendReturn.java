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
 * 还款记录表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("lend_return")
@ApiModel(value = "LendReturn对象", description = "还款记录表")
public class LendReturn extends BaseEntity {

    @ApiModelProperty("标的id")
    @TableField("lend_id")
    private Long lendId;

    @ApiModelProperty("借款信息id")
    @TableField("borrow_info_id")
    private Long borrowInfoId;

    @ApiModelProperty("还款批次号")
    @TableField("return_no")
    private String returnNo;

    @ApiModelProperty("借款人用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("借款金额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("计息本金额")
    @TableField("base_amount")
    private BigDecimal baseAmount;

    @ApiModelProperty("当前的期数")
    @TableField("current_period")
    private Integer currentPeriod;

    @ApiModelProperty("年化利率")
    @TableField("lend_year_rate")
    private BigDecimal lendYearRate;

    @ApiModelProperty("还款方式 1-等额本息 2-等额本金 3-每月还息一次还本 4-一次还本")
    @TableField("return_method")
    private Integer returnMethod;

    @ApiModelProperty("本金")
    @TableField("principal")
    private BigDecimal principal;

    @ApiModelProperty("利息")
    @TableField("interest")
    private BigDecimal interest;

    @ApiModelProperty("本息")
    @TableField("total")
    private BigDecimal total;

    @ApiModelProperty("手续费")
    @TableField("fee")
    private BigDecimal fee;

    @ApiModelProperty("还款时指定的还款日期")
    @TableField("return_date")
    private Date returnDate;

    @ApiModelProperty("实际发生的还款时间")
    @TableField("real_return_time")
    private Date realReturnTime;

    @ApiModelProperty("是否逾期")
    @TableField("is_overdue")
    private Boolean isOverdue;

    @ApiModelProperty("逾期金额")
    @TableField("overdue_total")
    private BigDecimal overdueTotal;

    @ApiModelProperty("是否最后一次还款")
    @TableField("is_last")
    private Boolean isLast;

    @ApiModelProperty("状态（0-未归还 1-已归还）")
    @TableField("status")
    private Integer status;


}
