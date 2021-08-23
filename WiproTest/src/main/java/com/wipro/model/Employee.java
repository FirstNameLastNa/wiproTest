package com.wipro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sushiltable")
public class Employee {


	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
     
    @Column(name="name")
    private String name;
     
    @Column(name="department")
    private String department;
     
    @Column(name="address")
    private String address;
     
    
    @Column(name="salary")
    private String salary;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public Employee(Long id, String name, String department, String address, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.address = address;
		this.salary = salary;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
     
    
    
    
   
}