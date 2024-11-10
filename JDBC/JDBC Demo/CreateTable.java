package com.createTable;

import java.sql.*;
public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			//load the drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			//creating connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root", "pass@123");
			
			//writing query
			String query="create table Exam(eid int auto_increment primary key,ename varchar(20)Not Null)";
			//creating statement
			Statement statement=con.createStatement();
			//exc
			statement.executeUpdate(query);
				
			System.out.println("table is created..");
		}

	}