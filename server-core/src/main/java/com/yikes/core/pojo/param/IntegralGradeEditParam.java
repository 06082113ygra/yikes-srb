package com.yikes.core.pojo.param;

import com.yikes.base.page.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * <p>
 * 积分等级表
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Data
@ToString
@ApiModel(value = "IntegralGrade对象", description = "积分等级表")
public class IntegralGradeEditParam extends PageForm {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("积分区间开始")
    private Integer integralStart;

    @ApiModelProperty("积分区间结束")
    private Integer integralEnd;

    @ApiModelProperty("借款额度")
    private BigDecimal borrowAmount;


}