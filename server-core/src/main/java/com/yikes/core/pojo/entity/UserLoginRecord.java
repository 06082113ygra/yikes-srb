package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户登录记录表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("user_login_record")
@ApiModel(value = "UserLoginRecord对象", description = "用户登录记录表")
public class UserLoginRecord extends BaseEntity {

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("ip")
    @TableField("ip")
    private String ip;


}
