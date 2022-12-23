package com.example.demo.service;

import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public interface getEmployeeByID {

    Employee getEmployeeByID(int id);
    Collection<Department> getDepartments();
}
