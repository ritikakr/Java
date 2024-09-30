package com.day4ques2;

public class Animal 
{
	public void makesound()
	{
		System.out.println("The animal makes a sound.");
	}
	
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		
		cat.makesound();
	}

}
