package com.day7;

import java.util.Stack;

public class StackExample 
{
	    public static void main(String[] args) 
	    {
	    		Stack<Integer> s = new Stack<>();
	    		// add elements to stack
	    		s.push(785);
	    		s.push(612);
	    		s.push(190);
	    		s.push(56);
	    		s.push(193);
	    		s.push(77);
	    		s.push(65);
	    		s.push(30);
	    		s.push(25);
	    		s.push(80);
	    		
	    		// prints stack at starting
	    		System.out.println("Stack is : " + s); 
	    		
	    		// remove and print removed 4 elements one by one
	    		System.out.println("\nRemoved element is : " + s.pop());
	    		System.out.println("Removed element is : " + s.pop());
	    		System.out.println("Removed element is : " + s.pop());
	    		System.out.println("Removed element is : " + s.pop());
	    		System.out.println("\nAfter deleting top 4 elements Stack is :");
	    		
	    		// updated stack
	    		System.out.println(s); 
	    	}
	    }
	


