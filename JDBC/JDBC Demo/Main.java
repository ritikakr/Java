package com.jdbc.retrivequery;
import java.sql.*;

public class Main 
{
	public static void main(String[] args)
	{
		//load the drivers
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			//create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management", "root", "pass@123");
			System.out.println("connection is done..");
			//create statement
			Statement statement=con.createStatement();
			//query
			String query="select * from student1";
			//result
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				int id=resultSet.getInt("sid");
				String name=resultSet.getString("sname");
				int age=resultSet.getInt("Age");
				System.out.println("student id="+id);
				System.out.println("student name="+name);
				System.out.println("student age="+age);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
