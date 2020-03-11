package com.spring.websiteacty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.spring.websiteacty")
public class REgistratoinformApplication {

	public static void main(String[] args) {
		SpringApplication.run(REgistratoinformApplication.class, args);
	}

}
