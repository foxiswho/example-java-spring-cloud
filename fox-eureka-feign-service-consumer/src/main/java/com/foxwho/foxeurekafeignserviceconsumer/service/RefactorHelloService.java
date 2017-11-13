package com.foxwho.foxeurekafeignserviceconsumer.service;

import com.foxwho.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "fox-service-provider")
public interface RefactorHelloService extends HelloService {


}