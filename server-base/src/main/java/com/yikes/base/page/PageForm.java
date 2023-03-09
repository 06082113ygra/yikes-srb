package com.yikes.base.page;

import io.swagger.annotations.ApiModelProperty;


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
    private Integer pn;
    @ApiModelProperty("页面大小")
    private Integer ps;


    public Integer getpn() {
        if (pn == null || pn < 1) {
            pn = 1;
        }
        return pn;
    }

    public void setpn(Integer pn) {
        this.pn = pn;
    }

    public Integer getps() {
        if (ps == null || ps < 1) {
            ps = 10;
        }
        return ps;
    }

    public void setps(Integer ps) {
        this.ps = ps;
    }
}
