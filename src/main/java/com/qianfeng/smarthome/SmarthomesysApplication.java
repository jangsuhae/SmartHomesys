package com.qianfeng.smarthome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qianfeng.smarthome.mapper")
public class SmarthomesysApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmarthomesysApplication.class, args);
	}

}
