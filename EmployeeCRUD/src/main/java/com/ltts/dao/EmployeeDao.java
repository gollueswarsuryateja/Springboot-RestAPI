package com.ltts.dao;

import com.ltts.entity.Employee;

public interface EmployeeDao {
	public void save(Employee emp);
	public Employee findById(Integer empid);
	public Employee updateEmp(Employee emp);
	public Employee deleteEmp(Integer empid);

}
