package com.liu.springcloud.service;

import com.liu.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {

    @Override
    public DeptClintService create(Throwable throwable) {
        return new DeptClintService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept().setDeptno(id).setDname("id"+id+"已经关闭").setDb_source("没有服务");
            }
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
