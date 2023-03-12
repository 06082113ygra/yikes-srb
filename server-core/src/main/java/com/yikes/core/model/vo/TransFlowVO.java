package com.yikes.core.model.vo;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 交易流水表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("交易流水表")
public class TransFlowVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("用户id")
	private Long userId;

	@ApiModelProperty("用户名称")
	private String userName;

	@ApiModelProperty("交易单号")
	private String transNo;

	@ApiModelProperty("交易类型（1：充值 2：提现 3：投标 4：投资回款 ...）")
	private Integer transType;

	@ApiModelProperty("交易类型名称")
	private String transTypeName;

	@ApiModelProperty("交易金额")
	private BigDecimal transAmount;

	@ApiModelProperty("备注")
	private String memo;

	@ApiModelProperty("创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	@ApiModelProperty("创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

}
