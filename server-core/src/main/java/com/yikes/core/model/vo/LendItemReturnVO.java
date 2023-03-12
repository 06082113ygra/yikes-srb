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
 * 标的出借回款记录表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("标的出借回款记录表")
public class LendItemReturnVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("标的还款id")
	private Long lendReturnId;

	@ApiModelProperty("标的项id")
	private Long lendItemId;

	@ApiModelProperty("标的id")
	private Long lendId;

	@ApiModelProperty("出借用户id")
	private Long investUserId;

	@ApiModelProperty("出借金额")
	private BigDecimal investAmount;

	@ApiModelProperty("当前的期数")
	private Integer currentPeriod;

	@ApiModelProperty("年化利率")
	private BigDecimal lendYearRate;

	@ApiModelProperty("还款方式 1-等额本息 2-等额本金 3-每月还息一次还本 4-一次还本")
	private Integer returnMethod;

	@ApiModelProperty("本金")
	private BigDecimal principal;

	@ApiModelProperty("利息")
	private BigDecimal interest;

	@ApiModelProperty("利息")
	private BigDecimal total;

	@ApiModelProperty("手续费")
	private BigDecimal fee;

	@ApiModelProperty("还款时指定的还款日期")
	private Date returnDate;

	@ApiModelProperty("实际发生的还款时间")
	private Date realReturnTime;

	@ApiModelProperty("是否逾期")
	private Integer isOverdue;

	@ApiModelProperty("逾期金额")
	private BigDecimal overdueTotal;

	@ApiModelProperty("状态（0-未归还 1-已归还）")
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
