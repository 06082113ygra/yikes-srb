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
 * 还款记录表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("还款记录表")
public class LendReturnVO {

	@ApiModelProperty("编号")
	private Long id;

	@ApiModelProperty("标的id")
	private Long lendId;

	@ApiModelProperty("借款信息id")
	private Long borrowInfoId;

	@ApiModelProperty("还款批次号")
	private String returnNo;

	@ApiModelProperty("借款人用户id")
	private Long userId;

	@ApiModelProperty("借款金额")
	private BigDecimal amount;

	@ApiModelProperty("计息本金额")
	private BigDecimal baseAmount;

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

	@ApiModelProperty("本息")
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

	@ApiModelProperty("是否最后一次还款")
	private Integer isLast;

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
