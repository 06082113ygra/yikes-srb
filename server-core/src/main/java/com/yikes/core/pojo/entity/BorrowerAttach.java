package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 借款人上传资源表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@TableName("borrower_attach")
@ApiModel(value = "BorrowerAttach对象", description = "借款人上传资源表")
public class BorrowerAttach extends BaseEntity {

    @ApiModelProperty("借款人id")
    @TableField("borrower_id")
    private Long borrowerId;

    @ApiModelProperty("图片类型（idCard1：身份证正面，idCard2：身份证反面，house：房产证，car：车）")
    @TableField("image_type")
    private String imageType;

    @ApiModelProperty("图片路径")
    @TableField("image_url")
    private String imageUrl;

    @ApiModelProperty("图片名称")
    @TableField("image_name")
    private String imageName;

}
