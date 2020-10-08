package com.shzp;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.shzp.*")
@MapperScan("com.shzp.*.dao")
@EnableAsync
@EnableTransactionManagement
public class ShiHuiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShiHuiApplication.class, args);
	}
}
