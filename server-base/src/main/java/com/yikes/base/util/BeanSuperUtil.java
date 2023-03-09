package com.yikes.base.util;

import cn.hutool.core.bean.BeanUtil;
import com.google.common.collect.Lists;
import com.yikes.base.convert.IConvert;
import com.yikes.base.page.PageResult;
import com.yikes.base.page.PgInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/5 17:34
 */
public class BeanSuperUtil extends BeanUtil {

    private static Logger logger = LoggerFactory.getLogger(BeanSuperUtil.class);

    public static <V> V convert(Object source, Class<V> toClazz) {
        if (source == null) {
            return null;
        } else {
            try {
                V to = toClazz.newInstance();
                copyProperties(source, to);
                return to;
            } catch (InstantiationException | IllegalAccessException var4) {
                logger.error("BeanSuperUtil ERROR", var4);
            }
            return null;
        }
    }

    public static <K, V> V convert(K source, Class<V> toClazz, IConvert<K, V> iConvert) {
        if (source == null) {
            return null;
        } else {
            try {
                V to = toClazz.newInstance();
                if (iConvert == null) {
                    copyProperties(source, to);
                } else {
                    iConvert.convert(source, to);
                }
                return to;
            } catch (InstantiationException | IllegalAccessException var4) {
                logger.error("BeanSuperUtil ERROR", var4);
            }
            return null;
        }
    }

    public static <V> List<V> convertList(List<?> list, Class<V> toClazz) {
        if (list == null) {
            return Lists.newArrayList();
        } else {
            List<V> toList = Lists.newArrayList();
            for (Object t : list) {
                toList.add(convert(t, toClazz));
            }
            return toList;
        }
    }

    public static <K, V> List<V> convertList(List<K> list, Class<V> toClazz, IConvert<K, V> iConvert) {
        if (list == null) {
            return Lists.newArrayList();
        } else {
            List<V> toList = Lists.newArrayList();
            for (K t : list) {
                toList.add(convert(t, toClazz, iConvert));
            }
            return toList;
        }
    }

    public static <V> PageResult<V> convertPage(com.github.pagehelper.PageInfo<?> dataPage, Class<V> toClazz) {
        PgInfo pageInfo = new PgInfo();
        pageInfo.setPageSize(dataPage.getPageSize());
        pageInfo.setTotalCount(dataPage.getTotal());
        pageInfo.setCurrentPage(dataPage.getPageNum());
        pageInfo.setTotalPage(dataPage.getPages());
        List<V> list = convertList(dataPage.getList(), toClazz);
        return new PageResult<>(list, pageInfo);
    }

    public static <K, V> PageResult<V> convertPage(com.github.pagehelper.PageInfo<K> dataPage, Class<V> toClazz, IConvert<K, V> iConvert) {
        PgInfo pageInfo = new PgInfo();
        pageInfo.setPageSize(dataPage.getPageSize());
        pageInfo.setTotalCount(dataPage.getTotal());
        pageInfo.setCurrentPage(dataPage.getPageNum());
        pageInfo.setTotalPage(dataPage.getPages());
        List<V> list = convertList(dataPage.getList(), toClazz, iConvert);
        return new PageResult<>(list, pageInfo);
    }
}
