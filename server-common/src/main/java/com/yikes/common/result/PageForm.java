package com.yikes.common.result;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/10 0:49
 */
public class PageForm {

    @ApiModelProperty("页码")
    private Integer pageNo;
    @ApiModelProperty("页面大小")
    private Integer pageSize;


    public Integer getPageNo() {
        if (pageNo == null || pageNo < 1) {
            pageNo = 1;
        }
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        if (pageSize == null || pageSize < 1) {
            pageSize = 10;
        }
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
