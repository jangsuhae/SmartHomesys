package com.qianfeng.smarthome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.qianfeng.smarthome.mapper")
@EnableSwagger2
public class SmarthomesysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmarthomesysApplication.class, args);
	}

}
