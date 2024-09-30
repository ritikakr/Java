package com.herichicalbusiness;

public class Business 
{
	public static void main(String[] args)
	{
		Local_business lb = new Local_business();
		lb.pan();
		lb.aadhar();
		lb.bank_details();
		lb.name();
		
		Internal_Business ib = new Internal_Business();
		ib.pan();
		ib.aadhar();
		ib.bank_details();
		ib.location();
	}

}
