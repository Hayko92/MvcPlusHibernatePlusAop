package com.example.MvcPlusHibernatePlusAop.services;

import com.example.MvcPlusHibernatePlusAop.entity.Employee;

import java.util.List;

public interface EmployeeService {
     Employee getEmployee(int id) ;


    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);
}
