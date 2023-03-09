package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户积分记录表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("user_integral")
@ApiModel(value = "UserIntegral对象", description = "用户积分记录表")
public class UserIntegral extends BaseEntity {

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("积分")
    @TableField("integral")
    private Integer integral;

    @ApiModelProperty("获取积分说明")
    @TableField("content")
    private String content;


}
