package com.heirachical;

public class Heirachical 
{ 
	public static void main(String[] args)
	{
		SBI s = new SBI();
		s.rate_of_interest();
		s.rbi_loan_dept();
		s.sbi_info();
		
		Swiss sw = new Swiss();
		sw.rbi_loan_dept();
		sw.rate_of_interest();
		sw.swiss_info();
	}

}
