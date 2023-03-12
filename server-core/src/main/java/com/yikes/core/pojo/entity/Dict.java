package com.yikes.core.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yikes.core.model.vo.DictVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 数据字典
 * </p>
 *
 * @author yikes
 * @since 2023-03-01
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@TableName("dict")
@ApiModel(value = "Dict对象", description = "数据字典")
public class Dict extends BaseEntity {

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

    @ApiModelProperty(value = "是否包含子节点")
    @TableField(exist = false)
    private List<Dict> child = null;

}
