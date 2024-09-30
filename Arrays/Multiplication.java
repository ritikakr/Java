package com.multiplication;

	public class Multiplication 
	{
	    public static void main(String[] args) 
	    {
	        int[] num = {2, 3, 4, 5};

	        int product = 1;
	        for (int i : num) 
	        {
	            product *= i;
	        }

	        System.out.println("Product of the numbers: " + product);
	    }
}
