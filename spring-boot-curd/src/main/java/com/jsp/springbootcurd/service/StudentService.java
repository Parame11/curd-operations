package com.jsp.springbootcurd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.springbootcurd.dao.StudentDao;
import com.jsp.springbootcurd.dto.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	

	public Student saveStudent(Student student) {
		return dao.save(student);
	}
	
	public List<Student>  getAllStudent(){
		return dao.findAll();
	}
	
	public Student getById(int id) {
		Optional<Student> optional=dao.findById(id);
		
		return optional.get();
	}
	
	public Student updateStudent(Student student) {
		Optional<Student> optional=dao.findById(student.getId());
		
		if(optional.get()!=null) {
		return	dao.save(student);
		}
		
		return null;
	}
	
	public String deleteById(int id) {
		
		Optional<Student> optional=dao.findById(id);
		
		if(optional.get()!=null) {
			dao.delete(optional.get());
			
			return "Data Deleted";
		}	
		return null;
		
		
	}
	
	

}
