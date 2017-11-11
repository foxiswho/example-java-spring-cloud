package com.foxwho.foxeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//注解启动一个服务注册中心
@EnableEurekaServer
@SpringBootApplication
public class FoxEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoxEurekaServerApplication.class, args);
	}
}
