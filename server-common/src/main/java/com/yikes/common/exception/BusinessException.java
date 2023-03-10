package com.yikes.common.exception;

import com.yikes.common.enums.ResultCodeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 *  使用一个或较少的异常类，可以捕获和显示所有的异常信息
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/3 0:07
 */
@Data
@NoArgsConstructor
public class BusinessException extends RuntimeException {

    // 状态码
    private Integer code;

    // 错误消息
    private String message;

    /**
     *
     * @param message 错误消息
     */
    public BusinessException(String message) {
        this.message = message;
    }

    /**
     *
     * @param message 错误消息
     * @param code 错误码
     */
    public BusinessException(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    /**
     *
     * @param message 错误消息
     * @param code 错误码
     * @param cause 原始异常对象
     */
    public BusinessException(String message, Integer code, Throwable cause) {
        super(cause);
        this.message = message;
        this.code = code;
    }

    /**
     *
     * @param resultCodeEnum 接收枚举类型
     */
    public BusinessException(ResultCodeEnum resultCodeEnum) {
        this.message = resultCodeEnum.getMessage();
        this.code = resultCodeEnum.getCode();
    }

    /**
     *
     * @param resultCodeEnum 接收枚举类型
     * @param cause 原始异常对象
     */
    public BusinessException(ResultCodeEnum resultCodeEnum, Throwable cause) {
        super(cause);
        this.message = resultCodeEnum.getMessage();
        this.code = resultCodeEnum.getCode();
    }

}
