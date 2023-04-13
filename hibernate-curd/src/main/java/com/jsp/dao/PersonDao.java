package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

public class PersonDao {

	public Person savePerson(Person person) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		if (person != null) {
			et.begin();
			em.persist(person);
			et.commit();
		}

		return person;
	}

	public Person updatePerson(Person person) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		if (person != null) {
			et.begin();
			em.merge(person);
			et.commit();
		}
		return person;

	}

	public Person getPersonById(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();

		Person person = em.find(Person.class, id);

		if (person != null) {
			System.out.println(" Data is present");
			return person;
		} else {
			System.out.println("please check the id");
		}

		return null;

	}

	public Person deleteById(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Person person2 = em.find(Person.class, id);
		if (person2 != null) {
			et.begin();
			em.remove(person2);
			et.commit();

		}
		return person2;

	}

	public List<Person> getAllPerson() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select p from Person p");
		
		

		return q.getResultList();
		
		

	}
	
	public Person personLogin(String email,String password) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		
		Query query=em.createQuery("select p from Person p where email=?1 and password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<Person> list=query.getResultList();
		
		return list.get(0) ;
		
		
	}
	
	

}
