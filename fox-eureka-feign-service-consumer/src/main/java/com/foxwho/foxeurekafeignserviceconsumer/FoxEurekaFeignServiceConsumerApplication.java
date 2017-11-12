package com.foxwho.foxeurekafeignserviceconsumer;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients        //开启
@EnableDiscoveryClient  //激活
@SpringBootApplication
public class FoxEurekaFeignServiceConsumerApplication {
//    @Bean
//    Logger.Level feignLoggerLevel() {
//        return Logger.Level.FULL;
//    }

    public static void main(String[] args) {
        SpringApplication.run(FoxEurekaFeignServiceConsumerApplication.class, args);
    }
}
