package com.comparable;

public class Employee implements Comparable<Employee>
{
	int id;
	String name;
	double sal;
	
	Employee(int id, String name, double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public int compareTo(Employee o) 
	{
		if(sal == o.sal)
		// TODO Auto-generated method stub
              return 0;
		
		else if(sal>o.sal)
			return 1;
		
		else
			return -1;
	}

}
