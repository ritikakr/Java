package com.employee;
public class Employee
{
	public static void main(String[] args)
	{
		
		Employee_detail[] emp;
		emp = new Employee_detail[3];
		
		emp[0]=new Employee_detail("E01","Ritika",25000.00);
		emp[1]=new Employee_detail("E02","Rits",45000.00);
		emp[2]=new Employee_detail("E03","Ritu",15000.00);
		
		System.out.println("Employee's data:");
		emp[0].display();
		emp[1].display();
		emp[2].display();
		
		
	}
		
	}

class Employee_detail
{
	String emp_id;
	String emp_name;
	double emp_sal;
	
	Employee_detail(String emp_id,String emp_name,double emp_sal)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
	}
	
	public void display()
	{
		System.out.println("Employee data is:"+emp_id+" "+emp_name+" "+emp_sal);
	}

}
