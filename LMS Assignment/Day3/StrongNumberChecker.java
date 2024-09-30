package com.day3;

import java.util.Scanner;

public class StrongNumberChecker 
{
	//finding factorial of any number
    public static int factorial(int num) 
    {
        int fact = 1;
        for (int i = 1; i <= num; i++) 
        {
            fact *= i;
        }
        return fact;
    }
    
    //Calculating for Strong Number condition
    public static boolean isStrongNumber(int num) 
    {
        int originalNum = num;
        int sumOfFactorials = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }

        return sumOfFactorials == originalNum;
    }

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isStrongNumber(number)) 
        {
            System.out.println(number + " is a strong number.");
        } 
        else 
        {
            System.out.println(number + " is not a strong number.");
        }
        sc.close();
    }
}
