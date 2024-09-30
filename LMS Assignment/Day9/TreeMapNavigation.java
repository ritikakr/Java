package com.day9;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapNavigation {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("apple", 10);
        treeMap.put("banana", 20);
        treeMap.put("cherry", 30);

        // Iterating over entries using entrySet()
        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Finding the first and last entries
        Map.Entry<String, Integer> firstEntry = treeMap.firstEntry();
        Map.Entry<String, Integer> lastEntry = treeMap.lastEntry();
        System.out.println("First entry: " + firstEntry);
        System.out.println("Last entry: " + lastEntry);

        // Finding elements near a given key
        Map.Entry<String, Integer> ceilingEntry = treeMap.ceilingEntry("banana");
        Map.Entry<String, Integer> floorEntry = treeMap.floorEntry("banana");
        System.out.println("Ceiling entry of banana: " + ceilingEntry);
        System.out.println("Floor entry of banana: " + floorEntry);

        
        // Checking for emptiness and size
        boolean isEmpty = treeMap.isEmpty();
        System.out.println("Is the tree map empty? " + isEmpty);
        int size = treeMap.size();
        System.out.println("Size of the tree map: " + size);

        // Removing an entry
        Integer removedValue = treeMap.remove("banana");
        System.out.println("Removed value: " + removedValue);
        System.out.println("Updated tree map: " + treeMap);

        // Iterating over keys using keySet()
        System.out.println("\nIterating over keys:");
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }

        // Iterating over values using values()
        System.out.println("\nIterating over values:");
        for (Integer value : treeMap.values()) {
            System.out.println(value);
        }
    }
}