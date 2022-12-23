package com.example.demo.service;

import com.example.demo.bean.Department;

import java.util.Collection;

public interface departmentDao {
    abstract  Collection<Department> getDepartments();
}
