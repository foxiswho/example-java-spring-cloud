package com.foxwho.configeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEurekaClientApplication.class, args);
	}
}
