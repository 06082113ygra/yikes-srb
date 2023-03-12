package com.yikes.core.model.vo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 用户绑定表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("用户绑定表")
public class UserBindVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("用户id")
	private Long userId;

	@ApiModelProperty("用户姓名")
	private String name;

	@ApiModelProperty("身份证号")
	private String idCard;

	@ApiModelProperty("银行卡号")
	private String bankNo;

	@ApiModelProperty("银行类型")
	private String bankType;

	@ApiModelProperty("手机号")
	private String mobile;

	@ApiModelProperty("绑定账户协议号")
	private String bindCode;

	@ApiModelProperty("状态")
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
