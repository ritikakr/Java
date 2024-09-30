package com.day9;

import java.util.TreeMap;

public class TreeMapRemoval {

    public static void main(String[] args) {
    	
    		
    		TreeMap<String, Integer> tm = new TreeMap<>();
    		
    		// adding elements
    		tm.put("One", 1);
    		tm.put("Two", 2);
    		tm.put("Three", 3);
    		
    		// print original TreeMap
    		System.out.println("Original TreeSet : " + tm);
    		
    		// remove(key) gives the value stored with key
    		// print removed value
    		System.out.println("Removed value = " + tm.remove("Two")); 
    		
    		// remove(key,value) will give a boolean value
    		// true if the entry deleted else false
            System.out.println("Is the entry {Three=3} removed? : " + tm.remove("Three", 3)); 

            //printing Updated TreeMap
            System.out.println("Updated TreeMap: " + tm); 
    	}
}