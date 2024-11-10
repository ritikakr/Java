package forloop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Prepare 
{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
		try
		{
	         Class.forName("com.mysql.cj.jdbc.Driver");   // register type-4 driver
	         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo","root","pass@123");
	         String q1 = "insert into employee(eid,ename,location, salary) values (?,?,?,?)";
	         PreparedStatement pst = con.prepareStatement(q1);
	         for(int i=0;i<3;i++)
	         	          {
	         	   
	         	        	   System.out.println("Enter employee id, name, location and salary");
	         	               int eid = sc.nextInt();
	         	               String ename = sc.next();
	         	               String location= sc.next();
	         	               int salary = sc.nextInt();
	         	               
	         	               pst.setInt(1, eid);
	         	               pst.setString(2, ename);
	         	               pst.setString(3, location);
	         	               pst.setInt(4, salary);
	         	               
	         	               pst.execute();
	         	          }
	 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
}


}
