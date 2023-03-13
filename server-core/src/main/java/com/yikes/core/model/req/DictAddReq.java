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
 * @date 2023/3/12 11:55
 */
@Data
@ToString
@ApiModel("数据字典-新增")
public class DictAddReq {

    @ApiModelProperty("上级id")
    @TableField("parent_id")
    private Long parentId;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("值")
    @TableField("value")
    private Integer value;

    @ApiModelProperty("编码")
    @TableField("dict_code")
    private String dictCode;

}
