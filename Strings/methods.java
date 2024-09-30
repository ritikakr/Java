package com.strings;

public class methods 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="Ritika Kumari";
		int len = s.length();
		
		char c = s.charAt(5);
		String rep = s.replace("Ritika","Rits");
		String upper=s.toUpperCase();
		String lower = s.toLowerCase();
	
		System.out.println(len);	
		System.out.println(c);
		System.out.println(rep);
		System.out.println(upper);
		System.out.println(lower);
		
		String str=new String("Name is Ritika");
		System.out.println(str.charAt(6));
		System.out.println(str.replace("Name", "My name"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(5,14));
		System.out.println(str.contains("Ritika"));
		
		
		
	}

}
