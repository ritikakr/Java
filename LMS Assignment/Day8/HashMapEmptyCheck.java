package com.day8;

import java.util.HashMap;
import java.util.Map;

/**
 * This class demonstrates how to check whether a HashMap is empty or not after removing all elements.
*/
public class HashMapEmptyCheck 
{	    
	     //Main entry point for the program.
	     
	    public static void main(String[] args) {
	        // Create a HashMap and add some elements
	        Map<String, Integer> map = new HashMap<>();
	        map.put("apple", 10);
	        map.put("banana", 20);
	        map.put("orange", 30);

	        // Print the initial contents of the HashMap
	        System.out.println("Fruits with their quantity: "+map);
	        
	        //getting keys and value 
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Remove all elements from the HashMap using the clear() method
	        map.clear();

	        // Check if the HashMap is empty
	        if (map.isEmpty()) 
	        {
	            System.out.println("The HashMap is now empty.");
	        } 
	        else 
	        {
	            System.out.println("The HashMap is not empty.");
	        }
	    }
	}


