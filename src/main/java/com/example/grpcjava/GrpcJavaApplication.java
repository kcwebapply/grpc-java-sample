package com.example.grpcjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.grpcjava"})
public class GrpcJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcJavaApplication.class, args);
	}

}
