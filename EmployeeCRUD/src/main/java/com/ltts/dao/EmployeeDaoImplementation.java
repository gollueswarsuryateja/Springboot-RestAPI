package com.ltts.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ltts.entity.Employee;

@Repository
public class EmployeeDaoImplementation implements EmployeeDao {
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	public Employee createEmp(Employee emp) {
		Employee emp1=entitymanager.merge(emp);
		return emp1;
		
	}

	@Override
	public Employee findById(Integer empid) {
		// TODO Auto-generated method stub
		Employee emp=entitymanager.find(Employee.class, empid);
		return emp;
	}

	@Override
	public Employee updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		Employee emp1=entitymanager.find(Employee.class, emp.getEid());
		emp1.setEname(emp.getEname());
		emp1.setSal(emp.getSal());
		entitymanager.merge(emp1);
		return emp1;
	}

	@Override
	public Employee deleteEmp(Integer empid) {
		// TODO Auto-generated method stub
		Employee e1=entitymanager.find(Employee.class, empid);
		entitymanager.remove(e1);
		return e1;
	}

}
