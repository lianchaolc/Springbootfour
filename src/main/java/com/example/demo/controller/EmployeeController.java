package com.example.demo.controller;

import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeDao;
import com.example.demo.service.departmentDao;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/****
 * 对list 列表返回的结果
 */
@Controller
public class EmployeeController {

//    @Autowired
//    private EmployeeDao employeeDao;
//    @Autowired
//    private departmentDao  departmentDao;

    @RequestMapping("/emps")
    public String list(Model model) {
//        Collection<Employee> employees = employeeDao.getAllEmployees();
//        model.addAttribute(employees);
        return "emp/list";//返回到list页面




    }

    //restful风格接收参数
    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        //查询指定id的员工,添加到empByID中,用于前端接收
//        Employee employeeByID = employeeDao.getEmployeeByID(id);
//        model.addAttribute("empByID", employeeByID);
        //查出所有的部门信息,添加到departments中,用于前端接收
//        Collection<Department> departments = departmentDao.getDepartments();
//        model.addAttribute("departments", departments);
        return "/emp/edit";//返回到编辑员工页面
    }
//    原文链接：https://blog.csdn.net/qq_45173404/article/details/108934414


}
