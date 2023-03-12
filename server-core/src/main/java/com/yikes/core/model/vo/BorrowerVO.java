package com.yikes.core.model.vo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 借款人
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("借款人")
public class BorrowerVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("用户id")
	private Long userId;

	@ApiModelProperty("姓名")
	private String name;

	@ApiModelProperty("身份证号")
	private String idCard;

	@ApiModelProperty("手机")
	private String mobile;

	@ApiModelProperty("性别（1：男 0：女）")
	private Integer sex;

	@ApiModelProperty("年龄")
	private Integer age;

	@ApiModelProperty("学历")
	private Integer education;

	@ApiModelProperty("是否结婚（1：是 0：否）")
	private Integer isMarry;

	@ApiModelProperty("行业")
	private Integer industry;

	@ApiModelProperty("月收入")
	private Integer income;

	@ApiModelProperty("还款来源")
	private Integer returnSource;

	@ApiModelProperty("联系人名称")
	private String contactsName;

	@ApiModelProperty("联系人手机")
	private String contactsMobile;

	@ApiModelProperty("联系人关系")
	private Integer contactsRelation;

	@ApiModelProperty("状态（0：未认证，1：认证中， 2：认证通过， -1：认证失败）")
	private Integer status;

	@ApiModelProperty("创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	@ApiModelProperty("创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;


}
