package com.yikes.common.utils;

import com.yikes.common.enums.ExceptionEnumFactory;
import com.yikes.common.exception.BusinessException;
import com.yikes.common.exception.CommonException;
import com.yikes.common.result.Result;
import com.yikes.common.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * <pre>
 *  断言工具类
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/3 0:34
 * @description: TODO
 */
@Slf4j
public abstract class Assert {

    private Assert() {
    }

    /**
     * 断言对象不为空
     * 如果对象obj为空，则抛出异常
     *
     * @param obj resultCodeEnum
     */
    public static void notNull(Object obj, ResultCodeEnum resultCodeEnum) {
        if (obj == null) {
            log.info("obj is null .........");
            throw new BusinessException(resultCodeEnum);
        }
    }

    /**
     * 断言对象不能为空
     *
     * @param obj 对象
     * @param ex  自定义异常
     */
    public static void isNotNull(Object obj, CommonException ex) {
        if (Objects.isNull(obj)) {
            throw ex;
        }
    }

    /**
     * 断言对象不能为空
     *  @param obj 对象
     * @param ef  异常输出对象
     */
    public static void isNotNull(Object obj, ExceptionEnumFactory ef) {
        if (Objects.isNull(obj)) {
            throw CommonException.build(ef);
        }
    }

    /**
     * 断言对象不能为空
     *
     * @param obj 对象
     * @param ef  异常输出对象
     */
    public static void isNotNull(Object obj, ExceptionEnumFactory ef, Object param1) {
        if (Objects.isNull(obj)) {
            throw CommonException.build(ef, param1);
        }
    }


    /**
     * 断言对象为空
     *
     * @param obj 对象
     * @param ex  自定义异常
     */
    public static void isNull(Object obj, CommonException ex) {
        if (Objects.nonNull(obj)) {
            throw ex;
        }
    }

    /**
     * 断言对象为空
     *
     * @param obj 对象
     * @param ef  自定义异常
     */
    public static void isNull(Object obj, ExceptionEnumFactory ef) {
        if (Objects.nonNull(obj)) {
            throw CommonException.build(ef);
        }
    }

    /**
     * 断言对象为空
     *
     * @param obj 对象
     * @param ef  自定义异常
     * @param o1  格外参数
     */
    public static void isNull(Object obj, ExceptionEnumFactory ef, Object o1) {
        if (Objects.nonNull(obj)) {
            throw CommonException.build(ef, o1);
        }
    }

    /**
     * 断言字符串不能为空或者空字符串
     *
     * @param str 字符串
     * @param ex  自定义异常
     */
    public static void isNotBlank(String str, CommonException ex) {
        if (StringUtils.isBlank(str)) {
            throw ex;
        }
    }

    /**
     * 断言字符串不能为空或者空字符串
     *
     * @param str 字符串
     * @param ef  自定义异常
     */
    public static void isNotBlank(String str, ExceptionEnumFactory ef) {
        if (StringUtils.isBlank(str)) {
            throw CommonException.build(ef);
        }
    }

    /**
     * 断言结果为true
     *
     * @param flag flag
     * @param ex   自定义异常
     */
    public static void isTure(boolean flag, CommonException ex) {
        if (Objects.equals(Boolean.FALSE, flag)) {
            throw ex;
        }
    }

    /**
     * 断言结果为true
     *
     * @param flag flag
     * @param ef   自定义异常
     */
    public static void isTure(boolean flag, ExceptionEnumFactory ef) {
        if (Objects.equals(Boolean.FALSE, flag)) {
            throw CommonException.build(ef);
        }
    }

    /**
     * 断言结果为true
     *
     * @param flag flag
     * @param ef   自定义异常
     */
    public static <T> void isTure(boolean flag, ExceptionEnumFactory ef, @NotNull T t) {
        if (Objects.equals(Boolean.FALSE, flag)) {
            throw CommonException.build(ef, t);
        }
    }

    /**
     * 断言结果为true
     *
     * @param flag flag
     * @param ef   自定义异常
     */
    public static void isTure(boolean flag, ExceptionEnumFactory ef, @NotNull Supplier<?> supplier) {
        if (Objects.equals(Boolean.FALSE, flag)) {
            throw CommonException.build(ef, supplier.get());
        }
    }


    /**
     * 断言返回结果为 正常
     *
     * @param resp 服务调用响应结果
     */
    public static <T> void isSuccess(Result<T> resp) {
        if (!ResultCodeEnum.SUCCESS.eq(resp.getCode())) {
            throw CommonException.build(ResultCodeEnum.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 断言两个对象相对
     *
     * @param obj1
     * @param obj2
     * @param ex
     */
    public static void isEq(Object obj1, Object obj2, CommonException ex) {
        if (!Objects.equals(obj1, obj2)) {
            throw ex;
        }

    }

    /**
     * 断言两个对象相对
     *
     * @param obj1
     * @param obj2
     * @param ef
     */
    public static void isEq(Object obj1, Object obj2, ExceptionEnumFactory ef) {
        if (!Objects.equals(obj1, obj2)) {
            throw CommonException.build(ef);
        }

    }

    /**
     * 断言集合为空
     */
    public static <T> void isEmpty(Collection<T> list, CommonException ex) {
        if (!CollectionUtils.isEmpty(list)) {
            throw ex;
        }
    }

    /**
     * 断言集合为空
     */
    public static <T> void isEmpty(Collection<T> list, ExceptionEnumFactory ef) {
        if (!CollectionUtils.isEmpty(list)) {
            throw CommonException.build(ef);
        }
    }

    /**
     * 断言集合不为空
     */
    public static <T> void isNotEmpty(Collection<T> list, CommonException ex) {
        if (CollectionUtils.isEmpty(list)) {
            throw ex;
        }
    }

    /**
     * 断言集合不为空
     */
    public static <T> void isNotEmpty(Collection<T> list, ExceptionEnumFactory ef) {
        if (CollectionUtils.isEmpty(list)) {
            throw CommonException.build(ef);
        }
    }

    /**
     * 直接抛出错误
     *
     * @param ef
     */
    public static void throwEx(ExceptionEnumFactory ef) {
        throw CommonException.build(ef);
    }

}
