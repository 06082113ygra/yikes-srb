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
 * 标的出借记录表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("标的出借记录表")
public class LendItemVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("投资编号")
	private String lendItemNo;

	@ApiModelProperty("标的id")
	private Long lendId;

	@ApiModelProperty("投资用户id")
	private Long investUserId;

	@ApiModelProperty("投资人名称")
	private String investName;

	@ApiModelProperty("投资金额")
	private BigDecimal investAmount;

	@ApiModelProperty("年化利率")
	private BigDecimal lendYearRate;

	@ApiModelProperty("投资时间")
	private Date investTime;

	@ApiModelProperty("开始日期")
	private Date lendStartDate;

	@ApiModelProperty("结束日期")
	private Date lendEndDate;

	@ApiModelProperty("预期收益")
	private BigDecimal expectAmount;

	@ApiModelProperty("实际收益")
	private BigDecimal realAmount;

	@ApiModelProperty("状态（0：默认 1：已支付 2：已还款）")
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
