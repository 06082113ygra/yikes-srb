package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户基本信息
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("user_info")
@ApiModel(value = "UserInfo对象", description = "用户基本信息")
public class UserInfo extends BaseEntity {

    @ApiModelProperty("1：出借人 2：借款人")
    @TableField("user_type")
    private Integer userType;

    @ApiModelProperty("手机号")
    @TableField("mobile")
    private String mobile;

    @ApiModelProperty("用户密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("用户昵称")
    @TableField("nick_name")
    private String nickName;

    @ApiModelProperty("用户姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("身份证号")
    @TableField("id_card")
    private String idCard;

    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty("微信用户标识openid")
    @TableField("openid")
    private String openid;

    @ApiModelProperty("头像")
    @TableField("head_img")
    private String headImg;

    @ApiModelProperty("绑定状态（0：未绑定，1：绑定成功 -1：绑定失败）")
    @TableField("bind_status")
    private Integer bindStatus;

    @ApiModelProperty("借款人认证状态（0：未认证 1：认证中 2：认证通过 -1：认证失败）")
    @TableField("borrow_auth_status")
    private Integer borrowAuthStatus;

    @ApiModelProperty("绑定账户协议号")
    @TableField("bind_code")
    private String bindCode;

    @ApiModelProperty("用户积分")
    @TableField("integral")
    private Integer integral;

    @ApiModelProperty("状态（0：锁定 1：正常）")
    @TableField("status")
    private Integer status;


}
