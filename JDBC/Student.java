package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Creating connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo","root", "pass123");
		
		//creating statement
		Statement statement = con.createStatement();
		
		//writing query
		String query = "Create table customer(id int auto_increment PRIMARY KEY , cname varchar(30) NOT NULL, clocation varchar(30) NOT NULL)";
		statement.executeUpdate(query);
		System.out.println("Table Created...");
		
		String query2 = "INSERT INTO customer(cname,clocation) VALUES ('Ritika','Ranchi'),('Karuna','Kolkata'),('Damini','Chennai')";
		statement.executeUpdate(query2);
		System.out.println("Data is inserted...");
		
		String query3 = "Select * from customer";
		System.out.println("Retriving data from customer..");
		
		ResultSet res = statement.executeQuery(query3);
		while(res.next())
		{
			int id = res.getInt("id");
			String name = res.getString("cname");
			String location = res.getString("clocation");
			
			System.out.println("Customer Id:"+ id + " Customer name:" + name + " Customer location:" + location);		
			
		}
		
				

	}

}
