package com.access;

public class Circle extends Area
{
   double r;
   double p = getValue();
   
   public void area_circle(int r)
   {
	   double area = p*r*r;
	   System.out.println("Area of Circle is:"+area);
   }
}
