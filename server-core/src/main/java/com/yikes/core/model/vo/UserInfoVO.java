package com.yikes.core.model.vo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户基本信息
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("用户基本信息")
public class UserInfoVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("1：出借人 2：借款人")
	private Integer userType;

	@ApiModelProperty("手机号")
	private String mobile;

	@ApiModelProperty("用户密码")
	private String password;

	@ApiModelProperty("用户昵称")
	private String nickName;

	@ApiModelProperty("用户姓名")
	private String name;

	@ApiModelProperty("身份证号")
	private String idCard;

	@ApiModelProperty("邮箱")
	private String email;

	@ApiModelProperty("微信用户标识openid")
	private String openid;

	@ApiModelProperty("头像")
	private String headImg;

	@ApiModelProperty("绑定状态（0：未绑定，1：绑定成功 -1：绑定失败）")
	private Integer bindStatus;

	@ApiModelProperty("借款人认证状态（0：未认证 1：认证中 2：认证通过 -1：认证失败）")
	private Integer borrowAuthStatus;

	@ApiModelProperty("绑定账户协议号")
	private String bindCode;

	@ApiModelProperty("用户积分")
	private Integer integral;

	@ApiModelProperty("状态（0：锁定 1：正常）")
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
