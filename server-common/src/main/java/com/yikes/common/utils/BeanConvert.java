package com.yikes.common.utils;

import com.yikes.common.enums.BaseExceptionEnum;
import com.yikes.common.exception.CommonException;
import com.yikes.common.result.ResultCodeEnum;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre>
 *  实体属性复制
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/3 22:34
 * @description: TODO
 */
public final class BeanConvert {

    /**
     * bean 转换
     * @param obj 源 bean 对象
     * @param clazz 目标 bean 的对象
     * @param <T>   泛型
     * @return  目标 bean 对象
     */
    public static <T> T toBean(@NotNull Object obj, @NotNull Class<T> clazz) {

        try {
            return clazz.newInstance();

        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            throw CommonException.build(BaseExceptionEnum.INTERNAL_SERVER_ERROR);
        }
    }

    public static <T> List<T> toBeanList(@NotNull List<?> list, @NotNull Class<T> clazz) {

        return list.stream().map(it -> toBean(it, clazz)).collect(Collectors.toList());
    }

}
