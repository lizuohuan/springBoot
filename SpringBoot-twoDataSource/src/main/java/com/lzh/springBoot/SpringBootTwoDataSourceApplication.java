package com.lzh.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootTwoDataSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTwoDataSourceApplication.class, args);
	}
}
