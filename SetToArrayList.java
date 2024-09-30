package com.set2ArrayList;

import java.util.*;

public class SetToArrayList 
{
	public static void main(String[] args)
	{
	   HashSet<Integer> h1 = new HashSet<Integer>();
	   
	   h1.add(100);
	   h1.add(20);
	   h1.add(90);
	   h1.add(50);
	   
	   System.out.println(h1);
	   
	   ArrayList<Integer> a1 = new ArrayList<Integer>(h1);
	   
	   System.out.println(a1);
	   
	   Collections.sort(a1);
	   System.out.println(a1);
	   
	   System.out.println(Collections.max(a1));
	   System.out.println(Collections.min(a1));
	   //System.out.println(Collections.sort(a1));
	   System.out.println(a1);
	   System.out.println(Collections.binarySearch(a1,50));
	   	
	}

}
