package com.liu.myrule;


import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShuoRule {
//放在这里是有原因的，如果放在同级目录下会被扫描而去
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
