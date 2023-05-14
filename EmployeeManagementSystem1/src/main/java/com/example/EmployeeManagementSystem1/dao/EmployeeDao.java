package com.example.EmployeeManagementSystem1.dao;

import com.example.EmployeeManagementSystem1.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeEntity , Long> {

}
