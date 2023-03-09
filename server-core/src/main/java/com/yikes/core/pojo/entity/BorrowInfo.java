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
 * 借款信息表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("borrow_info")
@ApiModel(value = "BorrowInfo对象", description = "借款信息表")
public class BorrowInfo extends BaseEntity {

    @ApiModelProperty("借款用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("借款金额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("借款期限")
    @TableField("period")
    private Integer period;

    @ApiModelProperty("年化利率")
    @TableField("borrow_year_rate")
    private BigDecimal borrowYearRate;

    @ApiModelProperty("还款方式 1-等额本息 2-等额本金 3-每月还息一次还本 4-一次还本")
    @TableField("return_method")
    private Integer returnMethod;

    @ApiModelProperty("资金用途")
    @TableField("money_use")
    private Integer moneyUse;

    @ApiModelProperty("状态（0：未提交，1：审核中， 2：审核通过， -1：审核不通过）")
    @TableField("status")
    private Integer status;

}
