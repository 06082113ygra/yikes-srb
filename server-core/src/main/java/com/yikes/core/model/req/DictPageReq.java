package com.yikes.core.model.req;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/12 11:54
 */
@Data
@ToString
@ApiModel("数据字典-查询list")
public class DictPageReq {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("上级id")
    private Long parentId;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("值")
    @TableField("value")
    private Integer value;

    @ApiModelProperty("编码")
    private String dictCode;

}
