package com.toov5.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.toov5.*"})
public class app {

	public static void main(String[] args) {
		SpringApplication.run(app.class, args);
	}
	
}
