package com.wipro.employeecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.Employee;
import com.wipro.service.EmployeeService;
import com.wipro.serviceimpl.RecordNotFoundException;

@RestController
@RequestMapping("/employees")
class EmployeeController {
	
	@Autowired
    EmployeeService service;
	
	
 
    @GetMapping
    @RequestMapping("/getEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> list = service.getAllEmployees();
 
        return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
    }
 
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException  {
        Employee entity = service.getEmployeeById(id);
 
        return new ResponseEntity<Employee>(entity, HttpStatus.OK);
    }
 
    @PostMapping
    @RequestMapping("/addEmployee")
    public ResponseEntity<Employee> createOrUpdateEmployee(Employee employee) throws RecordNotFoundException {
        Employee updated = service.createOrUpdateEmployee(employee);
        return new ResponseEntity<Employee>(updated, HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException{
        service.deleteEmployeeById(id);
        return HttpStatus.FORBIDDEN;
    }
 
}
