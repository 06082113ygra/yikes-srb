package com.yikes.common.enums;


/**
 * 异常枚举类工厂接口
 * @author guanrong.yin
 * @date 2023/3/3 1:22
 */
public interface ExceptionEnumFactory {

    /** 异常码 */
    Integer code();

    /** 异常描述 */
    String desc();

}
