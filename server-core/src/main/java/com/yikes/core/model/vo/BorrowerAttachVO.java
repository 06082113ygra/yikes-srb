package com.yikes.core.model.vo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 借款人上传资源表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("借款人上传资源表")
public class BorrowerAttachVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("借款人id")
	private Long borrowerId;

	@ApiModelProperty("图片类型（idCard1：身份证正面，idCard2：身份证反面，house：房产证，car：车）")
	private String imageType;

	@ApiModelProperty("图片路径")
	private String imageUrl;

	@ApiModelProperty("图片名称")
	private String imageName;

	@ApiModelProperty("创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	@ApiModelProperty("创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

}
