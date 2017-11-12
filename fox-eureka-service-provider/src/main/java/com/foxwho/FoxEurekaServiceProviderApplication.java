package com.foxwho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//激活
@EnableDiscoveryClient
@SpringBootApplication
public class FoxEurekaServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoxEurekaServiceProviderApplication.class, args);
	}
}
