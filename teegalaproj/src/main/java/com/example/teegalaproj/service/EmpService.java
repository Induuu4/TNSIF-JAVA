package com.example.teegalaproj.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.teegalaproj.model.Employee;
import com.example.teegalaproj.repo.EmpRepo;
@Service
public class EmpService {
	@Autowired
	EmpRepo er;
	
	//Insert
	public Employee addEmployee(Employee emp) {
		return er.save(emp);
	}
	
	

}
