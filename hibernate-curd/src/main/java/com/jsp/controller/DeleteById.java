package com.jsp.controller;

import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class DeleteById {

	public static void main(String[] args) {
		
		PersonService personService=new PersonService();
		
		Person person=personService.deleteById(5);
		if(person!=null) {
			System.out.println(person.getId()+"  id is deleted");
		}else {
			System.out.println("please check the id");
		}

	}

}
