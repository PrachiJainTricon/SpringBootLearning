package com.example.EmployeeManagementSystem1.controller;

import com.example.EmployeeManagementSystem1.entity.EmployeeEntity;
import com.example.EmployeeManagementSystem1.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/getAllEmployee")
    public ResponseEntity<List<EmployeeEntity>> getAllEmployee(){
        return ResponseEntity.ok(this.employeeServices.getAllEmployee());
    }

    // get employee by Id
    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable Long id){
        return ResponseEntity.ok(this.employeeServices.getEmployeeById(id));
    }

    @PostMapping("/registerEmployee")
    public ResponseEntity<EmployeeEntity> registerEmployee(@RequestBody EmployeeEntity employeeEntity){
        return ResponseEntity.ok(this.employeeServices.registerEmployee(employeeEntity));
    }

    @PutMapping("/updateEmployeeById/{id}")
    public ResponseEntity<EmployeeEntity> updateEmployeeById(@PathVariable Long id ,@RequestBody EmployeeEntity employeeEntity){
        employeeEntity.setId(id);
        return ResponseEntity.ok(this.employeeServices.updateEmployeeById(employeeEntity));
    }

    @DeleteMapping("/deleteEmployeeById/{id}")
    public ResponseEntity<Boolean> deleteEmployeeById(@PathVariable Long id){
        this.employeeServices.deleteEmployeeById(id);
        return ResponseEntity.ok(true);
    }

    // delete all employee
    @DeleteMapping("/deleteAllEmployee")
    public ResponseEntity<Boolean> deleteAllEmployee(){
        this.employeeServices.deleteAllEmployee();
        return ResponseEntity.ok(true);

    }



}
