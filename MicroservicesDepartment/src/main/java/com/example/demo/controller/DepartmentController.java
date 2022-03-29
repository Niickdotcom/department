package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService deptservice;
	
	@GetMapping("/")
	public List<Department> findAll(){
		return deptservice.findAll();
	}
	
	@GetMapping("/{id}")
	public Department findById(@PathVariable("id") int d) {
		return deptservice.findById(d);
	}

	@PostMapping("/save")
	public void save(@RequestBody Department d) {
		 deptservice.save(d);
		 System.out.println("Updating in the Code");
	}
	
	
	
}
