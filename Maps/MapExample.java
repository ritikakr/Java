package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> h1 = new HashMap<>();
		
		h1.put(101,"Ritika");
		h1.put(102,"Rits");
		h1.put(103, "Rita");
		h1.put(null, "abc");
		h1.put(105, null);
		
		System.out.println(h1);
		System.out.println(h1.size());
		
		System.out.println(h1.get(103));
		System.out.println(h1.remove(103));
		System.out.println(h1);
		
		System.out.println(h1.containsKey(104));
		System.out.println(h1.isEmpty());
		
		
		System.out.println(h1.get(null));
		System.out.println(h1.get(105));
		System.out.println(h1.values());
		
		System.out.println(h1.hashCode());
		
		for(Object string :h1.values())
		{
			System.out.println(string);
		}
		
		//System.out.println(Map.entry(106, "Ritika"));
		
		Set<Map.Entry<Integer,String>> it = h1.entrySet();
		
		for(Map.Entry<Integer,String> s: it )
		{
			System.out.println("Keys are:"+ s.getKey() + " values are:"+ s.getValue());
			
		}
		
		
		
	}

	

}
