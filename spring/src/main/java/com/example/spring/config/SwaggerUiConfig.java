package com.example.spring.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerUiConfig {

    //配置了Swagger的Docket的bean实例
    @Bean
    public Docket docket() {
        ParameterBuilder builder = new ParameterBuilder();
        ArrayList<Parameter> parameters = new ArrayList<>();
        builder.name("Authorization").description("token")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build();
        parameters.add(builder.build());

        return new Docket(DocumentationType.SPRING_WEB)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.spring"))
                .build().globalOperationParameters(parameters);
    }

    //配置Swagger 信息=apiInfo
    private ApiInfo apiInfo() {
        return new ApiInfo("Logistics Api", "test", "v1.0", "http:127.0.0.1/",
                null, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());
    }
}
