package com.example.DockerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class KubernatesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernatesDemoApplication.class, args);
	}

}
