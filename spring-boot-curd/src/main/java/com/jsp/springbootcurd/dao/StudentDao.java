package com.jsp.springbootcurd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcurd.dto.Student;

public interface StudentDao  extends JpaRepository<Student, Integer>{

}
