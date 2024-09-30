package com.armstrong;
import java.util.Scanner;

public class Mainarms 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no:");
		int number=sc.nextInt();

        Armstrongno an = new Armstrongno(number);
        boolean isArmstrong = an.isArmstrong();

        if (isArmstrong) 
        {
            System.out.println(number + " is an Armstrong number.");
        } 
        else
        {
            System.out.println(number + " is not an Armstrong number."); 
        }
        
        DerivedArmstrong dan = new DerivedArmstrong(number);
        boolean isArmstrongFromDerived = dan.isArmstrong();     
    }


}
