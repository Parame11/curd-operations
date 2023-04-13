package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class GetAllPerson {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		
		List<Person > list=personService.getAllPerson();
		
		for(Person person:list) {
			System.out.println("person id :"+person.getId());
			System.out.println("person Name :"+person.getName());
			System.out.println("person Age :"+person.getAge());
			System.out.println("person email :"+person.getEmail());
			System.out.println("person password :"+person.getPassword());
			System.out.println("------------------------------------------------");
			
			
		}

	}

}
