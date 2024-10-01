package com.join;

class MyThread5 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Currently working thread is:"+Thread.currentThread().getName());
			System.out.println(i);
		}
	}
}


public class Thread5
{
	public static void main(String[] args)
	{
		MyThread5 t1 = new MyThread5();
		MyThread5 t2 = new MyThread5();
		MyThread5 t3 = new MyThread5();
		
		t1.start();
		try {
	      Thread.sleep(500);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		t2.start();
		try {
			Thread.sleep(500);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		t3.start();
		try {
			Thread.sleep(500);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
