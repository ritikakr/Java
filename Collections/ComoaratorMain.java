package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComoaratorMain 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		a1.add(new Employee(45000.00,"Ritika"));
		a1.add(new Employee(50000.00,"Karuna"));
		a1.add(new Employee(65000.00,"Damini"));
		a1.add(new Employee(55000.00,"Divya"));
		a1.add(new Employee(60000.00,"Shikha"));
		
		//sorting as per sal
		Collections.sort(a1,new Sal());
		System.out.println("Sorting data by Salary");
		
		for(Employee emp:a1)
		{
			System.out.println(emp.sal+" "+emp.name);
		}
		
		//sorting data as per name
		Collections.sort(a1,new Name());
		System.out.println("Sorting data as per Name");
		
		for(Employee emp:a1)
		{
			System.out.println(emp.sal+" "+emp.name);
		}
		
		
	}

}
