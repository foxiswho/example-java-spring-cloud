package com.foxwho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import org.apache.log4j.Logger;
import java.util.List;

@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws Exception {

        for (String s : client.getServices()) {
            System.out.println("services " + s);
            List<ServiceInstance> serviceInstances = client.getInstances(s);
            for (ServiceInstance si : serviceInstances) {
                System.out.println("    services:" + s + ":getHost()=" + si.getHost());
                System.out.println("    services:" + s + ":getPort()=" + si.getPort());
                System.out.println("    services:" + s + ":getServiceId()=" + si.getServiceId());
                System.out.println("    services:" + s + ":getUri()=" + si.getUri());
                System.out.println("    services:" + s + ":getMetadata()=" + si.getMetadata());

                logger.info("/hello, host:" + si.getHost() + ", service_id:" + si.getServiceId());
            }
            System.out.println(serviceInstances.size());
            if (serviceInstances != null && serviceInstances.size() > 0) {
                System.out.println("serviceInstances.get(0).getUri()" + serviceInstances.get(0).getUri());
            }

        }


        return "ServiceProvider->1";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {

        return "ServiceProvider->hello1"+name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {

        return new User(name,age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {

        return "Hello "+ user.getName() + ", " + user.getAge();
    }
}
