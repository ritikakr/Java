package com.day4ques2;

public class MainAnimal 
{
	class Animal
	{
		public void makesound()
		{
			System.out.println("The animal makes a sound.");
		}
	}
	public class Dog extends Animal
	{
		public void makesound()
		{
			System.out.println("The Dog Barks.");
			super.makesound();
		}
	}
	
	public class Cat extends Dog
	{
		public void makesound()
		{
			System.out.println("The Cat meow");
			super.makesound();
		}

	}
	
	public static void main(String[] args)
	{
		MainAnimal ma = new MainAnimal();
		Cat c = ma.new Cat();
		
		c.makesound();
	}

}
