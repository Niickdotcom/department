package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DepartmenRepository;
import com.example.demo.entity.Department;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmenRepository deprepo;
	
	
	public List<Department> findAll(){
		return deprepo.findAll();
	}
	
	public Department findById(int id) {
		return deprepo.findById(id).get();
		
	}
	
	public void save(Department dep)
	{
		deprepo.save(dep);
	}

}
