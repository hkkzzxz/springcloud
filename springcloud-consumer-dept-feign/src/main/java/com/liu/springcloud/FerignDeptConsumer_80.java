package com.liu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.liu.springcloud"})
public class FerignDeptConsumer_80 {
        public static void main(String[] args) {
            SpringApplication.run(FerignDeptConsumer_80.class,args);
        }
    }
