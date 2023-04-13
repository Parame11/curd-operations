package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class SavePerson {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		
		Person person=new Person();
		person.setId(5);
		person.setName("Suresh");
		person.setAge(22);
		person.setEmail("suresh22@gmail.com");
		person.setPassword("suresh22");
		
		Person person2=personService.savePerson(person);
		
		if(person2!=null) {
			System.out.println(" Data Saved");	
		}else {
			System.out.println("please check ");
		}
		

	}

}
