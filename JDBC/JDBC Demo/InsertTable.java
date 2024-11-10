package com.InsertTable;
import java.sql.*;

public class InsertTable
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
				//load the drivers
				Class.forName("com.mysql.cj.jdbc.Driver");
				//creating connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo","root", "pass123");
				
				//writing query
				String query1="create table Customer(c_id int auto_increment primary key,cname varchar(20)Not Null, c_location varchar(20) NOT NULL)";
				String query2 = "INSERT INTO Customer(cname,c_location) VALUES\r\n" +"(('itika','Ranchi'),('Karuna','Kolkata'),('Damini,'Pune'),('Divya','Noida'))";
				
				//String query3="select * from Customer";
				
				Statement statement=con.createStatement();
					
				statement.executeUpdate(query1);
				System.out.println("Customer table created...");
				
			
		     	statement.executeUpdate(query2);				
			    System.out.println("Data inserted in Customer table..");
			    
			 
		
				
		 
			    			
						
		}
				
	}

		

