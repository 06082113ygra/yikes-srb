//package com.yikes.core.config;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
///**
// * <pre>
// *  mybatis-plus分页设置
// * </pre>
// *
// * @author guanrong.yin
// * @date 2023/3/1 22:11
// */
//@Configuration
//@MapperScan("com.yikes.core.mapper")
//@EnableTransactionManagement //事务处理
//public class MybatisPlusConfig {
//
//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor() {
//
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//
//        return interceptor;
//    }
//}
