package com.yikes.base.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/12 1:12
 */
@Configuration      //交给spring管理
@EnableTransactionManagement        //开启注解事务管理
@MapperScan("com.yikes.core.mapper")  //把启动类的扫描放到这了
public class MybatisPlusConfig {

    public MybatisPlusInterceptor mybatisPlusInterceptor() {

        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        // 添加乐观锁
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());

        // 添加分页
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());

        // 添加逻辑删除
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());

        return interceptor;
    }
}
