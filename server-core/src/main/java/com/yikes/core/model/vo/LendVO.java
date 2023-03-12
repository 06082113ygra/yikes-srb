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
 * 标的准备表
 * 
 * @author guanrong.yin
 * @email yikes_ygr@163.com
 * @date 2023-03-12 02:28:15
 */
@Data
@ToString
@ApiModel("标的准备表")
public class LendVO {

	@ApiModelProperty("编号")
	private Long id;
	@ApiModelProperty("借款用户id")
	private Long userId;

	@ApiModelProperty("借款信息id")
	private Long borrowInfoId;

	@ApiModelProperty("标的编号")
	private String lendNo;

	@ApiModelProperty("标题")
	private String title;

	@ApiModelProperty("标的金额")
	private BigDecimal amount;

	@ApiModelProperty("投资期数")
	private Integer period;

	@ApiModelProperty("年化利率")
	private BigDecimal lendYearRate;

	@ApiModelProperty("平台服务费率")
	private BigDecimal serviceRate;

	@ApiModelProperty("还款方式")
	private Integer returnMethod;

	@ApiModelProperty("最低投资金额")
	private BigDecimal lowestAmount;

	@ApiModelProperty("已投金额")
	private BigDecimal investAmount;

	@ApiModelProperty("投资人数")
	private Integer investNum;

	@ApiModelProperty("发布日期")
	private Date publishDate;

	@ApiModelProperty("开始日期")
	private Date lendStartDate;

	@ApiModelProperty("结束日期")
	private Date lendEndDate;

	@ApiModelProperty("说明")
	private String lendInfo;

	@ApiModelProperty("平台预期收益")
	private BigDecimal expectAmount;

	@ApiModelProperty("实际收益")
	private BigDecimal realAmount;

	@ApiModelProperty("状态")
	private Integer status;

	@ApiModelProperty("审核时间")
	private Date checkTime;

	@ApiModelProperty("审核用户id")
	private Long checkAdminId;

	@ApiModelProperty("放款时间")
	private Date paymentTime;

	@ApiModelProperty("放款人id")
	private Date paymentAdminId;

	@ApiModelProperty("创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	@ApiModelProperty("创建时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;


}
