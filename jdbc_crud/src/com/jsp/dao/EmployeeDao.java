package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Employee;

public class EmployeeDao {
	
	public void createTableEmployee() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			
			Statement statement=connection.createStatement();
			
			statement.execute("create table employee(id int primary key,name varchar(45),phone bigint(10),sal double,email varchar(45),password varchar(45))");
			
			connection.close();
			
			System.out.println("Table Created");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public Employee saveEmployee(Employee e) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			
			PreparedStatement p=connection.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
			
			p.setInt(1, e.getId());
			p.setString(2, e.getName());
			p.setInt(3, e.getPhone());
			p.setDouble(4, e.getSal());
			p.setString(5,e.getEmail());
			p.setString(6, e.getPassword());
			
			p.executeUpdate();
			connection.close();
			
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return e;
	}
	
	
public int updateEmployee(Employee e) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
			
			PreparedStatement p=connection.prepareStatement("update employee set name=?,phone=?,sal=?,email=?,password=? where id=?");
			
			p.setInt(1, e.getId());
			p.setString(2, e.getName());
			p.setInt(3, e.getPhone());
			p.setDouble(4, e.getSal());
			p.setString(5,e.getEmail());
			p.setString(6, e.getPassword());
			
			int res=p.executeUpdate();
			connection.close();
			System.out.println(res);
			return res;
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return 0;
	}

public int deleteEmployee(Employee e) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
		
		PreparedStatement p=connection.prepareStatement("delete from employee where id=?");
		
		p.setInt(1, e.getId());
		
		
		int res=p.executeUpdate();
		connection.close();
		System.out.println(res);
		return res;
		
	} catch (ClassNotFoundException e1) {
		
		e1.printStackTrace();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	return 0;
}

public List<Employee> getAllEmployee(){
	List<Employee> list =new ArrayList<Employee>();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
		
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery("select * from employee");
		
		while(resultSet.next()) {
			int id=resultSet.getInt(1);
			String name=resultSet.getString(2);
			int phone =resultSet.getInt(3);
			double sal=resultSet.getDouble(4);
			String email=resultSet.getString(5);
			String password =resultSet.getString(6);
			
			Employee employee=new Employee();
			employee.setId(id);
			employee.setName(name);
			employee.setPhone(phone);
			employee.setSal(sal);
			employee.setEmail(email);
			employee.setPassword(password);
			
			list.add(employee);
			
		}
		connection.close();
			
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return list;
}

public Employee getEmployeeById(int id) {
	Employee employee=new Employee();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud", "root", "root");
		
		PreparedStatement preparedStatement=connection.prepareStatement("select * from employee where id=?");
		preparedStatement.setInt(1, id);
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			int id1=resultSet.getInt(1);
			String name=resultSet.getString(2);
			int phone =resultSet.getInt(3);
			double sal=resultSet.getDouble(4);
			String email=resultSet.getString(5);
			String password =resultSet.getString(6);
			
			
			employee.setId(id1);
			employee.setName(name);
			employee.setPhone(phone);
			employee.setSal(sal);
			employee.setEmail(email);
			employee.setPassword(password);
			
			
			
		}
		connection.close();
			
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return employee;
	
}

}
