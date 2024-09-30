package com.day3;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] arr= {2,4,5,3,6,7,9,4,5,6};
		
		int[] sub_arr= Arrays.copyOfRange(arr, 2, 6);
		
		System.out.print("Original Array is: ");
		for(int i:arr)
		{
		System.out.print(i+" ");
		}
		
		System.out.println("\n");
		System.out.print("Sub Array is: ");
		for(int j:sub_arr)
		{
		System.out.print(j+" ");
		}
		
		Arrays.sort(sub_arr);
	
		
	   Arrays.sort(sub_arr);
	   
	   int sh = sub_arr[sub_arr.length - 2];
	   System.out.println("\n");
	   System.out.println("Second highest no in sub array is: " + sh);

	}

}
