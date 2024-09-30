package com.comparator;

import java.util.Comparator;

public class Sal implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{
		// TODO Auto-generated method stub
		if(o1.sal == o2.sal)
			return 0;
		
		else if(o1.sal>o2.sal)
			return 1;
		else
			return -1;
		
	}

}
