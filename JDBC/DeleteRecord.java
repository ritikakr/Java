package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		//load driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//Creating connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo","root", "pass123");
				
				//creating statement
				Statement statement = con.createStatement();
				
				String query1 = " DELETE from customer where id = 3";
				statement.executeUpdate(query1);
				System.out.println("Data Deleted...");
				
				
				String query2 = "Select * from customer";
				System.out.println("Retriving data from customer..");
				
				ResultSet res = statement.executeQuery(query2);
				while(res.next())
				{
					int id = res.getInt("id");
					String name = res.getString("cname");
					String location = res.getString("clocation");
					
					System.out.println("Customer Id:"+ id + " Customer name:" + name + " Customer location:" + location);		
					
				}

	}

}
