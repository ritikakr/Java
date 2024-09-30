package com.looselyCoupled;

public class LooselyCoupled 
{
	public static void main(String[] args)
	{
		Bank b=new Bank(new SBI());
		b.interest();
	}

}
