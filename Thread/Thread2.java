package com.threadExample;

class MyThread2 implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println("I am using runnable interface..");
		
	}
	
}

public class Thread2 
{
	public static void main(String[] args)
	{
		//object creation
		MyThread2 t2 = new MyThread2();
		
		//object of thread class- to access start() method in prog.
		Thread th = new Thread(t2);
		
		th.start();
		System.out.println("Main thread is running..");
		
	}

}
