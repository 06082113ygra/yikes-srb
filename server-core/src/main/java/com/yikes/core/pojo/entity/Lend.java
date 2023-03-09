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
 * 标的准备表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("lend")
@ApiModel(value = "Lend对象", description = "标的准备表")
public class Lend extends BaseEntity {


    @ApiModelProperty("借款用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("借款信息id")
    @TableField("borrow_info_id")
    private Long borrowInfoId;

    @ApiModelProperty("标的编号")
    @TableField("lend_no")
    private String lendNo;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("标的金额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("投资期数")
    @TableField("period")
    private Integer period;

    @ApiModelProperty("年化利率")
    @TableField("lend_year_rate")
    private BigDecimal lendYearRate;

    @ApiModelProperty("平台服务费率")
    @TableField("service_rate")
    private BigDecimal serviceRate;

    @ApiModelProperty("还款方式")
    @TableField("return_method")
    private Integer returnMethod;

    @ApiModelProperty("最低投资金额")
    @TableField("lowest_amount")
    private BigDecimal lowestAmount;

    @ApiModelProperty("已投金额")
    @TableField("invest_amount")
    private BigDecimal investAmount;

    @ApiModelProperty("投资人数")
    @TableField("invest_num")
    private Integer investNum;

    @ApiModelProperty("发布日期")
    @TableField("publish_date")
    private Date publishDate;

    @ApiModelProperty("开始日期")
    @TableField("lend_start_date")
    private Date lendStartDate;

    @ApiModelProperty("结束日期")
    @TableField("lend_end_date")
    private Date lendEndDate;

    @ApiModelProperty("说明")
    @TableField("lend_info")
    private String lendInfo;

    @ApiModelProperty("平台预期收益")
    @TableField("expect_amount")
    private BigDecimal expectAmount;

    @ApiModelProperty("实际收益")
    @TableField("real_amount")
    private BigDecimal realAmount;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("审核时间")
    @TableField("check_time")
    private Date checkTime;

    @ApiModelProperty("审核用户id")
    @TableField("check_admin_id")
    private Long checkAdminId;

    @ApiModelProperty("放款时间")
    @TableField("payment_time")
    private Date paymentTime;

    @ApiModelProperty("放款人id")
    @TableField("payment_admin_id")
    private Date paymentAdminId;

}
