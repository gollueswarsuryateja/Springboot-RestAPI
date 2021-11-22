package com.ltts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.entity.Employee;
import com.ltts.service.EmployeeService;

@RestController
@RequestMapping("/bank")
public class EmployeeRestController {
	@Autowired
	EmployeeService empService;
	
	@PostMapping("/create") //inserting data and it is restful annotation
	public String createAccount(@RequestBody Employee emp) {
		Employee e=empService.createEmployee(emp);
		if(e==null) {
			return "unable to insert";
		}
		else {
			return "Employee record inserted";
		}
			
	}
	@GetMapping("/read/{empId}")
	public Employee findEmployee(@PathVariable("empId") Integer empId) {
		return empService.findEmployee(empId);
		
	}
	@PutMapping("/update/{empid}")  //use put method in postman for updating
	public String updateEmp(@RequestBody Employee emp) {
		
		Employee e3=empService.updateEmployee(emp);
		if(e3!=null) {
			return "updated sucessfully";
		}
		else {
			return "update is not success";
		}
	}
	
	@DeleteMapping("/delete/{empId}")
	public String deleteEmp(@PathVariable("empId") Integer empId ) {
		Employee e1=empService.deleteEmpById(empId);
		if(e1==null) {
			return "delete is unsuccess";
		}
		else {
			return "delete is success";
		}
		
	}

}
