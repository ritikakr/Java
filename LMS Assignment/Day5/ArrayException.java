package com.day5;

//Importing Scanner class
import java.util.Scanner;

public class ArrayException {

	// Main driver method
	public static void main(String args[])
		throws ArrayIndexOutOfBoundsException
	{

		// Taking input from user
		Scanner sc = new Scanner(System.in);

		// Storing user input elements in an array
		System.out.println("Elements in array are:");
		int arr[] = new int[5];

		// Try block to check exception
		try {
			// Forcefully iteration loop no of times
			// these no of times > array size
			for (int i = 0; i < 6; i++) {

				// Storing elements through nextInt()
				arr[i] = sc.nextInt();
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// Print message when any exception occurs
			System.out.print("Array Bounds Exceeded...\nTry Again");
		}
	}
}
