package com.qianfeng.smarthome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@MapperScan("com.qianfeng.smarthome.mapper")
@EnableSwagger2
@ServletComponentScan
public class SmarthomesysApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SmarthomesysApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SmarthomesysApplication.class);
	}
}
