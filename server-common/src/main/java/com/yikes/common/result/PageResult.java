package com.yikes.common.result;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/10 0:10
 */
public class PageResult<T> implements Serializable {

    private List<T> data;
    private PageInfo pageInfo;

    public PageResult(List<T> data, PageInfo pageInfo) {
        this.data = data;
        this.pageInfo = pageInfo;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "data=" + data +
                ", pageInfo=" + pageInfo +
                '}';
    }
}
