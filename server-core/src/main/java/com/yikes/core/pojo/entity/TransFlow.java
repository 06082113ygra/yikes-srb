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
 * 交易流水表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("trans_flow")
@ApiModel(value = "TransFlow对象", description = "交易流水表")
public class TransFlow extends BaseEntity {

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("用户名称")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("交易单号")
    @TableField("trans_no")
    private String transNo;

    @ApiModelProperty("交易类型（1：充值 2：提现 3：投标 4：投资回款 ...）")
    @TableField("trans_type")
    private Integer transType;

    @ApiModelProperty("交易类型名称")
    @TableField("trans_type_name")
    private String transTypeName;

    @ApiModelProperty("交易金额")
    @TableField("trans_amount")
    private BigDecimal transAmount;

    @ApiModelProperty("备注")
    @TableField("memo")
    private String memo;


}
