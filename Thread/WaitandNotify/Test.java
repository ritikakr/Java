package com.WaitandNotify;


class Mythread extends Thread{

	//declare one sum variable
	int sum=0;
	
	public void run() {
		//sThis keyword refers to current object
		synchronized (this) {
			//caculate the sum
			System.out.println("child thread start working....");
			for (int i = 0; i <= 10; i++) {
				//last sum is final sum or we say we update last sum
				sum +=i;//sum=sum+i
				System.out.println("sum="+sum);
			}
				System.out.println("Child thread give notification to main thread");
				//we need to send the notification using notify method
				this.notify();
			
		}
	}
}
public class Test {

	public static void main(String[] args) throws InterruptedException {
		//create object first
		Mythread t1=new Mythread();
		t1.start();
		synchronized (t1) {
			System.out.println("main thread trying to call wait method...");
			//use wait method
			t1.wait();
			System.out.println("main thread get notify...");
			//System.out.println(t1.sum);
		}
	}
}
