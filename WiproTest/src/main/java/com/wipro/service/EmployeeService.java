package com.wipro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.model.Employee;
import com.wipro.serviceimpl.RecordNotFoundException;


public interface EmployeeService {
	
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Long id) throws RecordNotFoundException;
	
	
	
	
	
	void deleteEmployeeById(Long id) throws RecordNotFoundException;


	Employee createOrUpdateEmployee(Employee employee) throws RecordNotFoundException;

}
