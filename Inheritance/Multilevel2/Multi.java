package com.info;

public class Multi 
{
		public static void main(String[] args)
		{
			
			Scanner sc = new Scanner(System.in);
			
			String name = sc.nextLine();
			System.out.println("Name:"+name);
			
			String city = sc.nextLine();
			System.out.println("City:"+city);
			
			int roll = sc.nextInt();
			System.out.println("Roll no:"+roll);
			
			double sal = sc.nextDouble();
			System.out.println("Sal:"+sal);
			
			Student s = new Student();
			s.student_info();
			s.info();
			s.print();
			
		}
}
public class Person 
{
	String name,city;
	int id;
	
	public void print()
	{
		System.out.println("Persons info");
		System.out.println("Name:" + name + " " + "id:" + id + " " + "city:" + city);
	}

}
public class Employee extends Person
{
	String name,city;
	double sal;
	
	public void info()
	{
		System.out.println("Employee Info");
		System.out.println("Name:" + name + " " + "sal:" + sal + " " + "city:" + city);
	}
	
}

public class Student extends Employee
{
	String name,dept;
	int roll;
	
	public void student_info()
	{
		System.out.println("Students info");
		System.out.println("Name:" + name + " " + "Dept:" + dept + " " + "roll:" + roll);
	}

}


