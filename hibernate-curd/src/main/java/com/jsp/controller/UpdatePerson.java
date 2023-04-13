package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class UpdatePerson {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		
		Person person=new Person();
		person.setId(2);
		person.setName("raja");
		person.setAge(23);
		person.setEmail("raja12@gmail.com");
		person.setPassword("raja12");
		
		Person person2=personService.updatePerson(person);
		if(person2!=null) {
			System.out.println("Data is Updated");
		}else {
			System.out.println("please check the object");
		}

	}

}
