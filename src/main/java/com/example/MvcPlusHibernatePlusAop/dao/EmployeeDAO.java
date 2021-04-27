package com.example.MvcPlusHibernatePlusAop.dao;

import com.example.MvcPlusHibernatePlusAop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}
