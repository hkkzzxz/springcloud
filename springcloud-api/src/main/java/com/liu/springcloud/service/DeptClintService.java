package com.liu.springcloud.service;

import com.liu.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClintService {
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);
    @GetMapping("/dept/list")
    public List<Dept> queryAll();
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);
}
