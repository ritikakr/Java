package com.inheritance;

public class Calculatornew implements Calculator
{
	int a=100,b=40;

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int mul = a*b;
		System.out.println("Multiplication:"+b);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int div=a/b;
		System.out.println("Division:"+div);
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int add=a+b;
		System.out.println("Addition:"+add);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int sub = a-b;
		System.out.println("Substraction:"+sub);
		
	}
	
	public static void main(String[] args)
	{
		Calculator c = new Calculatornew();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
	

}
