package com.looselyCoupled;

public class Bank 
{
	Loosely l;
	
	Bank(Loosely l)
	{
		this.l=l;
	}
	
	public void interest()
	{
		System.out.println("Interest of Banks are:");
		l.ROI();
	}

}
