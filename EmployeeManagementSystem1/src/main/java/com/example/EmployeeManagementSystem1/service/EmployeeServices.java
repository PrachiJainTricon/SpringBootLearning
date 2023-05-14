package com.example.EmployeeManagementSystem1.service;

import com.example.EmployeeManagementSystem1.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeServices{
    public List<EmployeeEntity> getAllEmployee();

    public EmployeeEntity getEmployeeById(Long id);

    public EmployeeEntity registerEmployee(EmployeeEntity employeeEntity);

    public EmployeeEntity updateEmployeeById(EmployeeEntity id);

    public void deleteEmployeeById(Long id);

    public void deleteAllEmployee();
}
