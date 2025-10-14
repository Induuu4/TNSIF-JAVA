package com.example.teegalaproj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teegalaproj.model.Employee;

//MarkerInterface
public interface EmpRepo extends JpaRepository<Employee,Integer>{

	
	
}