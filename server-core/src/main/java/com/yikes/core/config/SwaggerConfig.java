package com.yikes.core.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.print.Doc;
import java.util.function.Predicate;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/1 23:54
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean(value = "defaultAdminApi")
    public Docket defaultAdminApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .enableUrlTemplating(false)
                // 创建接口文档的具体信息
                .apiInfo(adminApiInfo())
                // 创建选择器，控制哪些接口被加入文档
                .groupName("admin")
                .select()
                // 指定@ApiOperation标注的接口被加入文档
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("com.yikes.core.controller.admin"))
                .paths(this::filterPath)
//                .paths(PathSelectors.any())
                .build();
    }

    private boolean filterPath(String path) {
        boolean ret = path.endsWith("/error");
        return !ret;
        // 这块可以写其他的过滤逻辑
    }

    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder()
                .title("yikes-srb-admin后台管理系统平台")
                .description("defaultAdminApi是一个网络借贷信息中介服务-后台管理系统")
                .termsOfServiceUrl("https://www.yikes-demo.com")
                .version("1.0")
                .contact(new Contact("yikes", "www.yikes-demo.com", "yikes_ygr@163.com"))
                .build();

    }

    @Bean(value = "defaultAppApi")
    public Docket defaultAppApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enableUrlTemplating(false)
                .apiInfo(appApiInfo())
                .groupName("app")
                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("com.yikes.core.controller.admin"))
                .paths(this::filterPath)
                .build();

    }

    private ApiInfo appApiInfo() {

        return new ApiInfoBuilder()
                .title("yikes-srb-app端管理系统平台")
                .description("移动端平台管理系统-接口")
                .termsOfServiceUrl("https://www.yikes.com")
                .version("1.0.0")
                .contact(new Contact("yikes", "www.yikes.com", "m13627046506_1@163.com"))
                .build();
    }
}
