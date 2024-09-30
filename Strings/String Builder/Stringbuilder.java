package com.stringsbuilder;

public class Stringbuilder 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Ritika");
		sb.append(" Kumari");
		
		System.out.println(sb);
		System.out.println(sb.insert(0, " Rits"));
		System.out.println(sb.delete(6, 9));

	}

}
