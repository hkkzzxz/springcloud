package com.liu.springcloud.controller;

import com.liu.springcloud.pojo.Dept;
import com.liu.springcloud.service.DeptClintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DeptClintService service;
    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return this.service.addDept(dept);
    }
    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.service.queryAll();
    }
    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.queryById(id);
    }

}
