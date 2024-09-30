package com.day6;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberSum 
{
	    public static void main(String[] args) 
	    {
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(6);

	        //printing the original list
	        System.out.println("ArrayList elements are:"+ numbers);
	        // Using logic (iterating through the list and checking for even numbers)
	        
	        int sum1 = 0;
	        
	        //taking a variable iterating all the elements in the list one by one.
	        for (int number : numbers) 
	        {
	        	//checking each elements if divisible by 2 then it is a even no
	            if (number % 2 == 0) 
	            {
	            	//sum of all the even numbers 
	                sum1 += number;
	            }
	        }
	        //printing the result
	        System.out.println("Sum of even numbers using logic: " + sum1);
	        
	    }
	}

