package com.yikes.core.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/1 23:54
 * @description: TODO
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean(value = "defaultAdminApi")
    public Docket defaultAdminApi() {

        ApiSelectorBuilder builder = new Docket(DocumentationType.SWAGGER_2)
                .enableUrlTemplating(false)
                // 创建接口文档的具体信息
                .apiInfo(adminApiInfo())
                // 创建选择器，控制哪些接口被加入文档
                .select()
                // 指定@ApiOperation标注的接口被加入文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("com/yikes/core/controller/admin/*"))
                .paths(this::filterPath);

        return builder.build();
    }

    private boolean filterPath(String path) {
        boolean ret = path.endsWith("/error");
        if (ret) {
            return false;
        }
        // 这块可以写其他的过滤逻辑
        return true;
    }

    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder()
                .title("yikes-srb平台")
                .description("defaultAdminApi是一个网络借贷信息中介服务-后台管理系统")
                .termsOfServiceUrl("https://www.yikes-demo.com")
                .version("1.0")
                .contact(new Contact("yikes", "www.yikes-demo.com", "yikes_ygr@163.com"))
                .build();

    }
}
