package com.yikes.common.exception;

import cn.hutool.core.util.ObjectUtil;
import com.yikes.common.enums.ExceptionEnumFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 异常枚举必须继承此接口，用于抛出自定义异常枚举值
 * @author: zfan
 * @date: 2022/10/4
 */
@Getter
@AllArgsConstructor
public class CommonException extends RuntimeException{

    private final ExceptionEnumFactory enumFactory;

    public static CommonException build(ExceptionEnumFactory commonEnum) {
        return new CommonException(commonEnum);
    }

    /**
     * 自定义异常描述
     * @param commonEnum   异常枚举类
     * @param obj          描述信息
     */
    public static CommonException build(ExceptionEnumFactory commonEnum, Object obj) {
        ExceptionEnumFactory factory = new ExceptionEnumFactory() {
            @Override
            public Integer code() {
                return commonEnum.code();
            }
            @Override
            public String desc() {
                return (ObjectUtil.isNotNull(obj)) ? String.format(commonEnum.desc(), obj) : commonEnum.desc();
            }
        };
        return new CommonException(factory);
    }


    /**
     * 自定义异常描述
     * @param code   异常枚举类
     * @param msg    描述信息
     */
    public static CommonException build(int code, String msg) {
        ExceptionEnumFactory factory = new ExceptionEnumFactory() {
            @Override
            public Integer code() {
                return code;
            }
            @Override
            public String desc() {
                return msg;
            }
        };
        return new CommonException(factory);
    }

}
