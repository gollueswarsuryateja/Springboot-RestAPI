package com.ltts.service;

import com.ltts.entity.Employee;

public interface EmployeeService {
	//all these are abstract methods
	Employee createEmployee(Employee emp); //create
	Employee findEmployee(Integer empid); //Read
	Employee updateEmployee(Employee emp); //Update
	Employee deleteEmpById(Integer empid); //Delete

}
