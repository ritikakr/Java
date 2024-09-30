package com.overriding;

public class Child extends Parent
{
	public void print_info()
	{
		System.out.println("Child name:" + name);
	}
	
	public static void main(String[] args)
	{
		Child c = new Child();
		c.name="RAM";
		c.print_info("RAM");
	}

}
