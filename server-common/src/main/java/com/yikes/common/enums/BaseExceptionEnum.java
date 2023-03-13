package com.yikes.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/3 23:50
 */
@Getter
@AllArgsConstructor
public enum BaseExceptionEnum implements ExceptionEnumFactory{

    SUCCEED(0, "成功"),
    FAIL(-1, "服务器内部错误"),

    /**
     * 登录超时，请重新登录
     */
    LOGIN_EXPIRE(HttpStatus.BAD_REQUEST.value(), "登录超时，请重新登录"),
    /**
     * 非法签名，请重新登录
     */
    AUTH_ILLEGAL(HttpStatus.BAD_REQUEST.value(), "非法签名，请重新登录"),
    /**
     * 服务内部错误
     */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), "服务内部错误"),

    /**
     * 服务内部错误, 实例化对象出错
     */
    INSTANCE_OBJ_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), "服务内部错误, 实例化对象出错"),

    /**
     * 请求失败，非法的参数格式
     */
    ILLEGAL_MEDIA_TYPE(HttpStatus.BAD_REQUEST.value(), "请求失败，非法的参数格式"),
    /**
     * 请求方式出错
     */
    REQUEST_METHOD_ERROR(HttpStatus.BAD_REQUEST.value(), "请求方式出错"),
    /**
     * 操作过于频繁
     */
    IDEMPOTENT_ERROR(HttpStatus.BAD_REQUEST.value(), "操作过于频繁"),
    /**
     * 操作失败，数据不存在
     */
    DATA_NOT_EXIST(HttpStatus.BAD_REQUEST.value(), "操作失败，数据不存在"),

    PARENTID_DATA_NOT_EXIST(HttpStatus.BAD_REQUEST.value(), "操作失败，父id数据不存在"),
    /**
     * 操作失败，数据已存在
     */
    DATA_EXIST(HttpStatus.BAD_REQUEST.value(), "操作失败，数据已存在"),
    /**
     * 操作失败，请求参数有误
     */
    BAD_REQUEST_PARAMS(HttpStatus.BAD_REQUEST.value(), "操作失败，请求参数有误"),

    // 删除失败
    DELETION_FAILURE(10000, "删除失败，无此数据"),

    // 保存失败
    SAVE_FAILURE(10001, "保存失败，数据格式有误"),

    // 修改失败
    MODIFY_FAILURE(10003, "修改失败，"),

    ;

    Integer code;
    String desc;

    @Override
    public Integer code() {
        return 0;
    }

    @Override
    public String desc() {
        return null;
    }
}
