package com.liu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigCllientController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getconfig(){
        return "ConfigCllientController{" +
                "applicationName='" + applicationName + '\'' +
                ", eurekaServer='" + eurekaServer + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
