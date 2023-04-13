package com.jsp.springbootcurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcurd.dto.Student;
import com.jsp.springbootcurd.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return service.getAllStudent();
	}
	
	@GetMapping("/student/{id}")
	public Student getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody  Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("student/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}	
	
	

}
