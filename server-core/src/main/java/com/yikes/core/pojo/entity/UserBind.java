package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户绑定表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("user_bind")
@ApiModel(value = "UserBind对象", description = "用户绑定表")
public class UserBind extends BaseEntity {

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("用户姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("身份证号")
    @TableField("id_card")
    private String idCard;

    @ApiModelProperty("银行卡号")
    @TableField("bank_no")
    private String bankNo;

    @ApiModelProperty("银行类型")
    @TableField("bank_type")
    private String bankType;

    @ApiModelProperty("手机号")
    @TableField("mobile")
    private String mobile;

    @ApiModelProperty("绑定账户协议号")
    @TableField("bind_code")
    private String bindCode;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;


}
