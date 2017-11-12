package com.foxwho.foxeurekafeignserviceconsumer.service;

//import com.foxwho.foxeurekafeignserviceconsumer.service.impl.HelloServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import com.foxwho.foxeurekafeignserviceconsumer.model.User;

//@FeignClient(name="fox-service-provider", fallback = HelloServiceFallback.class)
@FeignClient(name="fox-service-provider")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name) ;

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
