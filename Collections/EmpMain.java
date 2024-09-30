package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmpMain 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(101,"Ritika",50000.00));
		emp.add(new Employee(102,"Rits",45000.00));
		emp.add(new Employee(103,"Rita",65000.00));
		emp.add(new Employee(104,"Riti",30000.00));
		
		Collections.sort(emp);
		
		for(Employee obj:emp)
		{
			System.out.println(obj.id+" "+obj.name+" "+obj.sal);
		}
		
	}

}
