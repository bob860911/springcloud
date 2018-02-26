package com.fulan.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages="com.fulan.zuul")
public class ServiceZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}
