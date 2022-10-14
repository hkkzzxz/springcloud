package com.liu.springcloud;

import com.liu.myrule.ShuoRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = ShuoRule.class)
public class DeptConsume_81 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsume_81.class,args);
    }
}
