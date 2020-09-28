package com.shzp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.shzp.dao")
@EnableAsync
public class ShiHuiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShiHuiApplication.class, args);
	}
}
