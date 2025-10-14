package com.example.teegalaproj.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.teegalaproj.model.Employee;
import com.example.teegalaproj.service.EmpService;
@RestController
public class EmpController {
	@Autowired
	EmpService es;
	
	@PostMapping("/addemployee")
	public Employee addEmp(@RequestBody Employee emp)
	{
		return emp;
		
	}
}