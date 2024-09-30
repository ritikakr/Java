package com.day7;

	import java.util.HashSet;

	/**
	 * This class provides a method to append a specified element to a HashSet,
	 * ensuring that the element is unique and not already present in the set.
	 */
	public class HashSetAppender 
	{

	    /**
	     * Appends the specified element to the HashSet if it doesn't already exist.
	     *
	     * @param set     The HashSet to which the element will be added.
	     * @param element The element to be appended.
	     */
	    public static void appendElement(HashSet<String> set, String element) 
	    {
	        // Check if the element is already in the set
	        if (!set.contains(element)) 
	        {
	            // Add the element to the set if it's unique
	            set.add(element);
	            System.out.println("Element '" + element + "' added to the set.");
	        } 
	        else 
	        {
	            // Inform the user that the element already exists
	            System.out.println("Element '" + element + "' already exists in the set.");
	        }
	    }
       // Main entry point for the program.
	     
	    public static void main(String[] args) {
	        // Create a HashSet to store fruits
	        HashSet<String> fruits = new HashSet<>();

	        // Add some initial fruits to the set
	        fruits.add("apple");
	        fruits.add("banana");
	        fruits.add("orange");

	        // Define a new fruit to be appended
	        String newFruit = "kiwi";

	        // Use the appendElement method to add the new fruit
	        appendElement(fruits, newFruit);

	        // Print the final contents of the set
	        System.out.println("Fruits in the set: " + fruits);
	    }
	}


