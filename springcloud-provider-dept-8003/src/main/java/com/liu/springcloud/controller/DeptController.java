package com.liu.springcloud.controller;

import com.liu.springcloud.pojo.Dept;
import com.liu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Autowired
   private DiscoveryClient discoveryClient;
    @PostMapping("/dept/add")
    public boolean add(Dept dept)
    {
        return deptService.addDept(dept);
    }
    @GetMapping("/dept/list")
     public List<Dept> queryAll() {
  return deptService.queryAll();
    }
    @GetMapping("/dept/get/{id}")
    public Dept Get(@PathVariable("id")Long id)
    {
        return deptService.queryById(id);
    }
//    //注册进来的微服务
   @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> services=discoveryClient.getServices();
        System.out.println("discovery=>service"+services);
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance:instances)
        {
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getHost()+"\t"+
                            instance.getUri()+"\t"+
                            instance.getServiceId()
            );
        }
        return this.discoveryClient;
   }
}