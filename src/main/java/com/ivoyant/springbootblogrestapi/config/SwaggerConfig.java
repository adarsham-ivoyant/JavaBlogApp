package com.ivoyant.springbootblogrestapi.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI myOpenApi(){
        Info info=new Info().title("MyBlogApplication");
        return new OpenAPI().info(info);
    }
}
