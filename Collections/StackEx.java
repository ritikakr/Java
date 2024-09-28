package com.collections;

import java.util.Stack;

public class StackEx 
{

	public static void main(String[] args)
	{
		
		Stack<Integer> st = new Stack<>();
		
		System.out.println(st.empty());
		st.push(97);
		st.push(100);
		st.push(57);
		st.push(87);
		st.push(100);
		
		System.out.println(st);
		System.out.println(st.search(97));

		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.search(100));
		System.out.println(st.search(87));
		
	}
}
