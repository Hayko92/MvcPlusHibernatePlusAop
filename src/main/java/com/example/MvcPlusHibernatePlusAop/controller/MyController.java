package com.example.MvcPlusHibernatePlusAop.controller;

import com.example.MvcPlusHibernatePlusAop.dao.EmployeeDAO;
import com.example.MvcPlusHibernatePlusAop.entity.Employee;
import com.example.MvcPlusHibernatePlusAop.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmployees",allEmployees);
        return "allEmployeesView";
    }
}
