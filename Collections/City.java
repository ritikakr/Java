package com.arrylist;

import java.util.ArrayList;

public class City 
{
	public static void main(String[] args)
	{
       ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Mumbai");
		a1.add("Pune");
		a1.add("Bengalore");
		a1.add("Ranchi");
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.size());
		
		a1.get(2);
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		a1.set(1, "Delhi");
		System.out.println(a1);
		a1.contains("Mumbai");
		System.out.println(a1);
		
		for(Object o : a1)
		{
			System.out.println("lists are:"+o);
		}
		
	}

}
