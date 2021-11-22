package com.ltts.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.dao.EmployeeDaoImplementation;
import com.ltts.entity.Employee;
@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService {
   @Autowired
   EmployeeDaoImplementation empDao;
   
   
	@Override
	public Employee createEmployee(Employee emp) {
		
		return empDao.createEmp(emp);
	}

	@Override
	public Employee findEmployee(Integer empid) {
		// TODO Auto-generated method stub
		return empDao.findById(empid);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empDao.updateEmp(emp);
	}

	@Override
	public Employee deleteEmpById(Integer empid) {
		// TODO Auto-generated method stub
		return empDao.deleteEmp(empid);
	}

}
