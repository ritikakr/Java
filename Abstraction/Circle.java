package com.abstraction;

public class Circle extends Shape
{

	void area()
	{
		double pi=3.14,area;
		int r=4;
		area = pi*r*r;
		System.out.println("Area of circle is:"+area);
	}
	
	public static void main(String[] args)
	{
		Shape s = new Circle();
		
		s.area();
		s.msg();
	}

}
