package com.day3;

class User 
{
    int id;
    String name;

    public User(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User 
{
    double salary;

    public Employee(int id, String name, double salary) 
    {
        super(id, name);
        this.salary = salary;
    }

    public double setAnnualSalary() 
    {
        return salary * 12;
    }
}

public class InheritanceExample 
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee(1, "Ritika Kumari ", 50000);
        double annualSalary = emp.setAnnualSalary();
        System.out.println("Employee ID: " + emp.id);
        System.out.println("Employee Name: " + emp.name);
        System.out.println("Annual Salary: " + annualSalary);
    }
}


