package com.yikes.base.page;

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
    private PgInfo pgInfo;

    public PageResult(List<T> data, PgInfo pgInfo) {
        this.data = data;
        this.pgInfo = pgInfo;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PgInfo getPageInfo() {
        return pgInfo;
    }

    public void setPageInfo(PgInfo pgInfo) {
        this.pgInfo = pgInfo;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "data=" + data +
                ", pageInfo=" + pgInfo +
                '}';
    }
}
