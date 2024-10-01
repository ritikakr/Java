package com.synchorinize;

class Table extends Thread
{
	synchronized void printTable(int n) throws InterruptedException 
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(n*i);
		}try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
class PrintTable1 extends Table
{
	Table t;
	public PrintTable1(Table t)
	{
	  this.t = t;
	}
	public void run()
	{
		try {
			t.printTable(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class PrintTable2 extends Table
{
	Table t;
	public PrintTable2(Table t)
	{
	  this.t = t;
	}
	public void run()
	{
		try {
			t.printTable(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class Thread6 
{
	public static void main(String[] args)
	{
		Table obj = new Table();
		
		PrintTable1 t1 = new PrintTable1(obj);
		PrintTable2 t2 = new PrintTable2(obj);
		
		t1.start();
		t2.start();
	}

}
