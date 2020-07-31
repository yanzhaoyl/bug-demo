package com.yanzhaoyl.bug;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;


// 加入 包 扫描
@SpringBootApplication(exclude = MongoAutoConfiguration.class, scanBasePackages = { "com.yanzhaoyl.bug" })

// 开启 Mapper 的 扫描
@MapperScan(basePackages = { "com.yanzhaoyl.bug.demo.mapper" })
public class Application {

	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(Application.class);
		sa.run(args);
	}
}
