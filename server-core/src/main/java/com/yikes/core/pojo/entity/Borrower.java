package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 借款人
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("borrower")
@ApiModel(value = "Borrower对象", description = "借款人")
public class Borrower extends BaseEntity {

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("身份证号")
    @TableField("id_card")
    private String idCard;

    @ApiModelProperty("手机")
    @TableField("mobile")
    private String mobile;

    @ApiModelProperty("性别（1：男 0：女）")
    @TableField("sex")
    private Integer sex;

    @ApiModelProperty("年龄")
    @TableField("age")
    private Integer age;

    @ApiModelProperty("学历")
    @TableField("education")
    private Integer education;

    @ApiModelProperty("是否结婚（1：是 0：否）")
    @TableField("is_marry")
    private Boolean isMarry;

    @ApiModelProperty("行业")
    @TableField("industry")
    private Integer industry;

    @ApiModelProperty("月收入")
    @TableField("income")
    private Integer income;

    @ApiModelProperty("还款来源")
    @TableField("return_source")
    private Integer returnSource;

    @ApiModelProperty("联系人名称")
    @TableField("contacts_name")
    private String contactsName;

    @ApiModelProperty("联系人手机")
    @TableField("contacts_mobile")
    private String contactsMobile;

    @ApiModelProperty("联系人关系")
    @TableField("contacts_relation")
    private Integer contactsRelation;

    @ApiModelProperty("状态（0：未认证，1：认证中， 2：认证通过， -1：认证失败）")
    @TableField("status")
    private Integer status;

}
