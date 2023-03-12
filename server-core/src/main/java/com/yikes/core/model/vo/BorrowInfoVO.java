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
 * 借款信息表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("借款信息表")
public class BorrowInfoVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("借款用户id")
	private Long userId;

	@ApiModelProperty("借款金额")
	private BigDecimal amount;

	@ApiModelProperty("借款期限")
	private Integer period;

	@ApiModelProperty("年化利率")
	private BigDecimal borrowYearRate;

	@ApiModelProperty("还款方式 1-等额本息 2-等额本金 3-每月还息一次还本 4-一次还本")
	private Integer returnMethod;

	@ApiModelProperty("资金用途")
	private Integer moneyUse;

	@ApiModelProperty("状态（0：未提交，1：审核中， 2：审核通过， -1：审核不通过）")
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
