package com.yikes.core;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author guanrong.yin
 * @date 2023/3/12 0:46
 */
@SpringBootTest
public class KaKaCodeGenerator {

    @Test
    public void codeGenerator() {

        List<String> tables = new ArrayList<>();
//        tables.add("borrow_info");
//        tables.add("borrower");
//        tables.add("borrower_attach");
//        tables.add("dict");
//        tables.add("integral_grade");
//        tables.add("lend");
//        tables.add("lend_item");
//        tables.add("lend_item_return");
//        tables.add("lend_return");
//        tables.add("trans_flow");
//        tables.add("user_account");
//        tables.add("user_bind");
//        tables.add("user_info");
//        tables.add("user_integral");
        tables.add("user_login_record_copy");


        //(1)第一步获取项目路径
        String projectPath = "D:/JetBrainsit-work/Idea-Java/yikes-srb/server-core";

        //（2）创建生产器
        FastAutoGenerator.create(
                "jdbc:mysql://127.0.0.1:3306/srb_core?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai",
                "root",
                "qwe123")
                // 全局配置 GlobalConfig
                .globalConfig(builder -> {
                    builder.author("yikes")                                 // 设置作者名
                            .fileOverride()                                 // 开启覆盖已生成文件，默认值false
                            .enableSwagger()                                // 开启 swagger 模式，默认值false
                            .dateType(DateType.ONLY_DATE)                   //定义生成的实体类中日期类型
                            // 指定输出目录，注意可根据包修改，20211206!!!!
                            .outputDir(projectPath + "/src/main/java");
                })
                // 包配置 PackageConfig
                .packageConfig(builder -> {
                    builder.parent("com.yikes")                     // 设置父包名,注意一定要根据包修改，20211206!!!!
                            .moduleName("core")                    // 父包模块名，默认值:无，注意根据包修改，20211206!!!!
                            .entity("pojo.entity")                       // Entity包名
                            .service("service")                     // Service包名
                            .serviceImpl("service.impl")            // ServiceImpl包名
                            .controller("controller")               // Controller包名
                            .mapper("mapper")                       // Mapper包名
                            .xml("mapper")                          // Mapper XML包名
                            // 路径配置信息，设置mapperXml生成路径
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, projectPath + "/src/main/resources/mapper"));
                })
                // 配置策略 StrategyConfig
                .strategyConfig(builder -> {
                    builder.addInclude(tables)              // 增加表匹配，需要映射的数据库中的表名
//                            .addTablePrefix("biz_")                         // 增加过滤表前缀，生成时将数据库表的前缀"p_"去掉

                            // 1.service策略配置
                            .serviceBuilder()
                            .formatServiceFileName("%sService")             // 格式化 service 接口文件名称
                            .formatServiceImplFileName("%sServiceImpl")     // 格式化 service 实现类文件名称

                            // 2.实体策略配置
                            .entityBuilder()
//                            .formatFileName("%eEntiey")
                            .naming(NamingStrategy.underline_to_camel)      // 数据库表映射到实体的命名策略，下划线转驼峰命名
                            .enableLombok()                                 // 开启 lombok 模型
                            .logicDeleteColumnName("is_deleted")            // 逻辑删除字段名(数据库),注意修改，陈20211206！！！
                            .enableTableFieldAnnotation()                   // 开启生成实体时生成字段注解
//                            .idType(IdType.AUTO)                            // 全局主键类型,如用不到，注意修改，陈20211206！！！

                            // 3.controller策略配置
                            .controllerBuilder()
                            .formatFileName("%sController")                 // 格式化文件名称
                            .enableRestStyle()                              // 开启生成@RestController 控制器

                            // 4.mapper策略配置
                            .mapperBuilder()
                            .superClass(BaseMapper.class)                   // 设置父类
                            .enableMapperAnnotation()                       // 开启 @Mapper 注解
                            .formatMapperFileName("%sMapper")               // 格式化 mapper 文件名称
                            .formatXmlFileName("%sMapper");                 // 格式化 xml 实现类文件名称
                })

                .templateEngine(new VelocityTemplateEngine())             // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }

}
