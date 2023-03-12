package com.yikes.base.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.List;
import java.util.TimeZone;

/**
 * <pre>
 *   通用配置
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/11 23:21
 */
@Configuration
@AllArgsConstructor
@MapperScan("com.yikes.core.mapper")
public class CommonConfig {

//    private static final Logger logger = LoggerFactory.getLogger(CommonConfig.class);
//
//    /**
//     * 自定义线程池前缀名
//     */
//    private static final String THREAD_POOL_NAME_PREFIX = "common-task-thread";
//
//    /**
//     * 时间序列化格式
//     */
    private static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
//
//    /**
//     * 线程池配置
//     */
//    private final ThreadTaskPoolProperties properties;
//
//    /**
//     * 线程池配置
//     */
//    @Bean
//    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
//        ThreadPoolTaskExecutor threadPool = new ThreadPoolTaskExecutor();
//        threadPool.setThreadNamePrefix(THREAD_POOL_NAME_PREFIX);
//        threadPool.setCorePoolSize(properties.getCoreSize());
//        threadPool.setMaxPoolSize(properties.getMaxSize());
//        threadPool.setQueueCapacity(properties.getQueueSize());
//        threadPool.setKeepAliveSeconds(properties.getAliveSeconds());
//        return threadPool;
//    }
//
//    /**
//     * 自定义redis 序列化规则
//     */
//    @Bean
//    public RedisCacheConfiguration redisCacheConfiguration() {
//        RedisSerializationContext.SerializationPair<Object> searlize =
//                RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer());
//        return RedisCacheConfiguration.defaultCacheConfig().serializeValuesWith(searlize);
//    }
//
//    /**
//     * 加密
//      * @return
//     */
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    /**
//     * mybatis-plus 拦截器
//     */
//    @Bean
//    public MybatisPlusInterceptor mybatisPlusInterceptor(List<InnerInterceptor> interceptors) {
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        // 添加自定义拦截器
//        for (InnerInterceptor innerInterceptor : interceptors) {
//            interceptor.addInnerInterceptor(innerInterceptor);
//        }
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
//        return interceptor;
//    }

    /**
     * 日期序列化
     */
    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS));
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }


    /**
     * 只对配置了数据源的服务启动swagger
     * 例如 网关就不需要
     */
    /*@ConditionalOnMissingBean(Docket.class)
    @Order(100)
    @Bean(value = "dockerBean")
    public Docket dockerBean() {
        //指定使用Swagger2规范
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        //描述字段支持Markdown语法
                        .description("# 车间管理系统 API")
                        .version("1.0")
                        .build())
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.cloud.controller"))
                .paths(PathSelectors.any())
                .build();
    }*/

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {

        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        //添加此配置
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // CTT 上海
        objectMapper.setTimeZone(TimeZone.getTimeZone(ZoneId.SHORT_IDS.get("CTT")));
        converter.setObjectMapper(objectMapper);
        return converter;
    }

}
