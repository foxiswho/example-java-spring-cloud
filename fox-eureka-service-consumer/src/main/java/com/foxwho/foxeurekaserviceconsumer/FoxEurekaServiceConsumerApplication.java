package com.foxwho.foxeurekaserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//开启断路器功能
@EnableCircuitBreaker
//激活
@EnableDiscoveryClient
@SpringBootApplication
public class FoxEurekaServiceConsumerApplication {

	@Bean
	@LoadBalanced	//开启客户端负载均衡
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(FoxEurekaServiceConsumerApplication.class, args);
	}
}
