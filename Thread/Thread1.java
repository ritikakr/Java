package com.threadExample;

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("My first thread is running..");
	}

}

public class Thread1 
{
	public static void main(String[] args)
	{
		//object
		MyThread t1 = new MyThread();
		
		//use methods of thread like start()
		t1.start();
		
		System.out.println("Main thread is running...");
	}
}

