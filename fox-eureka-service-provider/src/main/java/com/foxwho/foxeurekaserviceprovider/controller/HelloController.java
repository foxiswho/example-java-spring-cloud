package com.foxwho.foxeurekaserviceprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.Logger;

import java.util.List;

@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {

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
}
