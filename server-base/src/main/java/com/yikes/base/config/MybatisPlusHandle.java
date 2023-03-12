package com.yikes.base.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/12 1:19
 */
@Configuration
public class MybatisPlusHandle implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {

        this.setFieldValByName("create_time", new Date(), metaObject);
        this.setFieldValByName("update_time", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {

        this.setFieldValByName("update_time", new Date(), metaObject);
    }
}
