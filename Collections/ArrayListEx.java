package com.arrylist;
import java.util.ArrayList;

public class ArrayListEx 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(100);
		a1.add(200);
		a1.add(50);
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.size());
		
		a1.get(2);
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		a1.set(1, 300);
		System.out.println(a1);
		a1.contains(200);
		System.out.println(a1);
		
		for(Object o : a1)
		{
			System.out.println("lists are:"+o);
		}
		
	}

}
