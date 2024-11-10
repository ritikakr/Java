package com.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Prepared
{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
		try
		{
			
			//1.loading the driver.
	         Class.forName("com.mysql.cj.jdbc.Driver");   // register type-4 driver
	         
	         //2.creating connection
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo","root","pass123");
	         
	         //inserting queries using prepared statement
	         String q1 = "insert into employee(eid,ename,location, salary) values (?,?,?,?)";
	         PreparedStatement pst[] = new PreparedStatement[3];
	         for(int i=0;i<3;i++)
	         	          {
	         	        	   pst[i] =  con.prepareStatement(q1);
	         	        	   System.out.println("Enter employee id, name, location and salary");
	         	               int eid = sc.nextInt();
	         	               String ename = sc.next();
	         	               String location= sc.next();
	         	               int salary = sc.nextInt();
	         	               
	         	               pst[i].setInt(1, eid);
	         	               pst[i].setString(2, ename);
	         	               pst[i].setString(3, location);
	         	               pst[i].setInt(4, salary);
	         	               
	         	               pst[i].execute();
	         	          }
	 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}
}