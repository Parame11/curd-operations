package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetPersonById {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		
		Person person=personService.getPersonById(2);
		if(person!=null) {
			System.out.println("person id : "+person.getId());
			System.out.println("person Name : "+person.getName());
			System.out.println("person Age : "+person.getAge());
			System.out.println("person Email : "+person.getEmail());
			System.out.println("person Password : "+person.getPassword());
			System.out.println("============================================= ");
			
			
			
		}

	}

}
