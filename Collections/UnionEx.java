package com.hashset;
import java.util.Collections;
import java.util.HashSet;

public class UnionEx 
{
	public static void main(String[] args)
	{
		HashSet set1 = new HashSet();
		set1.add("Ritika");
		set1.add('A');
		set1.add(789);
		set1.add(1011);
		set1.add(null);
		System.out.println("Set 1 Hashset is:"+set1);
		
		HashSet set2 = new HashSet();
		set2.add("Rits");
		set2.add('B');
		set2.add(1011);
		set2.add("Ritika");
		set2.add(1011);
		set2.add(456);
		System.out.println("Set 2 Hashset is:"+set2);
		
		//union
     	//set1.addAll(set2);
	    //System.out.println("Union of two hashset are:"+set1);
	    
	    //retain
	    //set1.retainAll(set2);
	    //System.out.println("Retain of two hashset are:"+set1);
		
		//uncommon
		set1.removeAll(set2);
		System.out.println("uncommon elements of two hashset are:"+set1);
		
		//diference
		System.out.println(set1.containsAll(set2));
		
	
	}

}
