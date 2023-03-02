package com.yikes.common.exception;

import com.yikes.common.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;

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

    private Assert() {}

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
}
