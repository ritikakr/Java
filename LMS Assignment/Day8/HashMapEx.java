package com.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {

        // Create a HashMap to store book titles and their prices
        HashMap<String, Double> books = new HashMap<>();

        // Add book titles and prices to the HashMap
        books.put("The Alchemist", 345.00);
        books.put("The Art of War", 195.00);
        books.put("The Lean Startup", 450.00);
        books.put("Pride and Prejudice", 200.00);

        // Print all books and their prices
        System.out.println("All Books in the HashMap:");
        System.out.println(books);

        // Print book names only
        System.out.println("\nBook Names:");
        for (String bookName : books.keySet()) {
            System.out.println(bookName);
        }

        // Print book prices only
        System.out.println("\nBook Prices:");
        for (Double price : books.values()) {
            System.out.println(price);
        }

        // Iterate over all key-value pairs using Entry Set
        System.out.println("\nBook Details (Name and Price):");
        Set<Entry<String, Double>> entrySet = books.entrySet();
        for (Entry<String, Double> entry : entrySet) {
            String bookName = entry.getKey();
            Double price = entry.getValue();
            System.out.println("Book name: " + bookName + ", Book price: " + price);
        }

        // Print all books and their prices again (unchanged for demonstration)
        System.out.println("\nAll Books after Iterating:");
        System.out.println(books);

        // Update the price of "The Art of War"
        System.out.println("\nUpdating Price of 'The Art of War':");
        for (Entry<String, Double> entry : books.entrySet()) {
            if (entry.getKey().equals("The Art of War")) {
                entry.setValue(250.00);
                break; // Update only once, exit the loop after finding the book
            }
        }

        // Print all books and their prices after updating the price
        System.out.println("\nAll Books after Price Update:");
        System.out.println(books);
    }
}