package com.yikes.core.model.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.yikes.base.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * <pre>
 *  借款人上传资源表
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/11 23:07
 */
@Data
@ToString
@ApiModel("借款人上传资源-分页")
public class BorrowerAttachPageReq extends PageForm {

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
