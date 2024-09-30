package com.inheritance;

public class Honda1 implements Bike1, Car {

	@Override
	public void avg1() {
		// TODO Auto-generated method stub
		System.out.println("Inside avg1 method");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method");
		
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		System.out.println("Inside avg method");
		
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Inside engine method");
		
	}
	
	public static void main(String[] args)
	{
		
		Car c = new Honda1();
		Bike1 b = new Honda1();
		
		c.avg1();
		b.engine();
		b.avg();
		b.run();
			
	}

}
