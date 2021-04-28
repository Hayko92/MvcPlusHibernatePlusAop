package com.example.MvcPlusHibernatePlusAop.dao;

import com.example.MvcPlusHibernatePlusAop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Repository
public class EmployeeDAOimpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override

    public List<Employee> getAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class,id);
       return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class,id);
        session.delete(employee);
    }
}
