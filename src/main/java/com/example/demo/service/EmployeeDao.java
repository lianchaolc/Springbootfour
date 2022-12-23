package com.example.demo.service;

import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;

/***
 * 返回了列表的实体
 */
@Service
public interface EmployeeDao {

    Collection<Employee> getAllEmployees ();
    Employee  getEmployeeByID(int id);
    Collection<Department> getDepartments();
}
