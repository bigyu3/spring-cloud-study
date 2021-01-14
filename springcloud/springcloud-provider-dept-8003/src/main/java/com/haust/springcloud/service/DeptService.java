package com.haust.springcloud.service;

import com.haust.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Auther: csp1999
 * @Date: 2020/05/17/22:04
 * @Description:
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
