package com.employee;
import java.sql.*;

public class Employee 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
				//load the drivers
				Class.forName("com.mysql.cj.jdbc.Driver");
				//creating connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo","root", "pass@123");
				
				//writing query
				String query1="create database Employee";
				String query2="use Employee";
				String query3="create table Employee(eid int auto_increment primary key,ename varchar(20)Not Null, location varchar(20) NOT NULL, salary int NOT NULL)";
						
				//creating statement
				Statement statement=con.createStatement();
				//Execute
				statement.executeUpdate(query1);
					
				System.out.println("Database is created..");
				
				statement.executeUpdate(query2);
				System.out.println("Use employee table");
				
				statement.executeUpdate(query3);
				System.out.println("Table created inside employee database");
				
			}

		}

