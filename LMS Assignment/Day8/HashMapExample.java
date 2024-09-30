package com.day8;

import java.util.HashMap;

public class HashMapExample 
{
	   public static void main(String[] args) 
	   {
	        // Create a HashMap to store key-value pairs
	        HashMap<String, Integer> map = new HashMap<>();

	        // Associate a value with a key using the put() method
	        map.put("apple", 10);
	        map.put("banana", 20);
	        map.put("orange", 30);

	        // Retrieve the value associated with a key using the get() method
	        Integer appleQuantity = map.get("apple");
	        System.out.println("Quantity of apples: " + appleQuantity);

	        // Iterate over all key-value pairs in the HashMap
	        for (String key : map.keySet()) {
	            Integer value = map.get(key);
	            System.out.println(key + ": " + value);
	        }
	    }
	}


