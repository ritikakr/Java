package com.hashset;
import java.util.*;

public class HashsetEx 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<Integer> h1 = new HashSet<Integer>();
		
		h1.add(500);
		h1.add(200);
		h1.add(30);
		h1.add(250);
		h1.add(98);
		
		System.out.println(h1);
		System.out.println(h1.contains(200));
		
		h1.remove(null);
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		
		System.out.println(Collections.max(h1));
		System.out.println(Collections.min(h1));			

	}

}
