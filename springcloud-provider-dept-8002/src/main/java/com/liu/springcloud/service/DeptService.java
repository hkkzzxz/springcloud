package com.liu.springcloud.service;

import com.liu.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);
    public List<Dept> queryAll();
    public Dept queryById(Long deptno);
}