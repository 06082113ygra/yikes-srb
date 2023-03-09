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
 * 用户账户
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("user_account")
@ApiModel(value = "UserAccount对象", description = "用户账户")
public class UserAccount extends BaseEntity {


    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("帐户可用余额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("冻结金额")
    @TableField("freeze_amount")
    private BigDecimal freezeAmount;


    @ApiModelProperty("版本号")
    @TableField("version")
    private Integer version;


}
