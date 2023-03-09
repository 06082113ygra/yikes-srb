package com.yikes.common.convert;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/10 0:33
 */
public interface IConvert<K, V> {

    /**
     * Bean转换
     * @param k 待转换
     * @param v 转换后
     */
    void convert(K k, V v);
}
