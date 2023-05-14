package com.example.EmployeeManagementSystem1.service;

import com.example.EmployeeManagementSystem1.dao.EmployeeDao;
import com.example.EmployeeManagementSystem1.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServices {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return this.employeeDao.findAll();
    }

    // get employee by id
    @Override
    public EmployeeEntity getEmployeeById(Long id) {
        return this.employeeDao.findById(id).get();
    }

    @Override
    public EmployeeEntity registerEmployee(EmployeeEntity employeeEntity) {
        return this.employeeDao.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployeeById(EmployeeEntity id) {
        return this.employeeDao.save(id);
    }

    @Override
    public void deleteEmployeeById(Long id) {
         this.employeeDao.deleteById(id);
    }

    @Override
    public void deleteAllEmployee() {
        this.employeeDao.deleteAll();
    }


}
