package com.jsp.controller;

import java.util.List;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;

public class EmployeeController {

	public static void main(String[] args) {
//		Employee employee=new Employee();
//		
//		employee.setId(5);
//		employee.setName("raju2");
//		employee.setPhone(987653432);
//		employee.setSal(10000);
//		employee.setEmail("raju1132@gmail.com");
//		employee.setPassword("raju32");
		
		
		EmployeeDao employeeDao=new EmployeeDao();
		
//		this is for table creation
//		employeeDao.createTableEmployee();
		
//		insert the data into the date and saved
//	
//		employeeDao.saveEmployee(employee);
		
//		int res=employeeDao.updateEmployee(employee);
//		if(res>0) {
//			System.out.println("data updated");
//		}else {
//			System.out.println("data not updated");
//		}
		
		
//		data deleted
//		int res=employeeDao.deleteEmployee(employee);
//		
//		if(res>0) {
//			System.out.println("data deleted");
//		}else {
//			System.out.println("data not deleted");
//		}
	
		
//		list the all the data 
//	List<Employee> list=employeeDao.getAllEmployee();
//	for(Employee employee:list) {
//		System.out.println("Employee Id : "+employee.getId());
//		System.out.println("Employee Name : "+employee.getName());
//		System.out.println("Employee Phone : "+employee.getPhone());
//		System.out.println("Employee sal : "+employee.getSal());
//		System.out.println("Employee Email : "+employee.getEmail());
//		System.out.println("Employee Password : "+employee.getPassword());
//		System.out.println("-------------------------------------------------------------");
//		
//	}
//	
		
		Employee employee=employeeDao.getEmployeeById(2);
		if(employee!=null) {
			System.out.println("Employee Id : "+employee.getId());
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee Phone : "+employee.getPhone());
			System.out.println("Employee sal : "+employee.getSal());
			System.out.println("Employee Email : "+employee.getEmail());
			System.out.println("Employee Password : "+employee.getPassword());
			
		}
		
	
	


		

	}

}
