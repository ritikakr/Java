package com.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This class demonstrates how to create a Map to store cricketer names and their scores,
 * and then search for a specific cricketer's score.
 */
public class CricketerScores 
{
    //main entry point of the program
    public static void main(String[] args) 
    {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Add cricketer names and scores to the Map
        cricketerScores.put("Virat Kohli", 12000);
        cricketerScores.put("Sachin Tendulkar", 15000);
        cricketerScores.put("Rohit Sharma", 10000);
        
        //printing map interface 
        System.out.println("Cricketer name with score:"+cricketerScores);

        // Get user input for the cricketer's name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cricketer's name: ");
        String cricketerName = scanner.nextLine();

        // Search for the cricketer's score and display it
        Integer score = cricketerScores.get(cricketerName);
        if (score != null) 
        {
            System.out.println(cricketerName + "'s score is: " + score);
        } 
        else 
        {
            System.out.println("Cricketer not found.");
        }

        scanner.close();
    }
}
