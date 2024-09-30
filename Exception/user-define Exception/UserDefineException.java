package com.userdefineexception;
import java.util.Scanner;

public class UserDefineException extends Exception
{
	UserDefineException(String UPI_ID)
	{
		super(UPI_ID);
	}
	static void ID(int id) throws UserDefineException
	{
		if(id != 1234)
		{
			throw new UserDefineException("Its a wrong UPI ID!!!");
		}
		else
		{
	       System.out.println("Valid UP ID");
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int upi = sc.nextInt();
		try {
			ID(upi);
		}catch(UserDefineException e)
		{
			System.out.println("Exception occured");
		}
	}

}
