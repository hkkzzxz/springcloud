package com.liu.springcloud.service;

import com.liu.springcloud.dao.DeptDao;
import com.liu.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }

    @Override
    public Dept queryById(Long deptno) {
        return deptDao.queryById(deptno);
    }
}

 