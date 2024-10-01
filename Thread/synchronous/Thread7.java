package com.synchorinize;

class Factorial extends Thread
{
	synchronized void factorial(int n) throws InterruptedException 
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
		 fact =fact*i;
		}
		System.out.println("Factorial of number"+" "+n+" is: "+fact);
	}
	
}
class Factorial1 extends Factorial
{
	Factorial f;
	public Factorial1(Factorial f)
	{
	  this.f = f;
	}
	public void run()
	{
		try {
			f.factorial(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Factorial2 extends Factorial
{
	Factorial f;
	public Factorial2(Factorial f)
	{
	  this.f = f;
	}
	public void run()
	{
		try {
			f.factorial(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class Thread7
{
	public static void main(String[] args)
	{
		Factorial f = new Factorial();
		
		Factorial1 f1 = new Factorial1(f);
		Factorial2 f2 = new Factorial2(f);
		
		f1.start();
		f2.start();
	}

}

