package com.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Here we are reversing a list by using a logic as well as by using collection methods.
public class StringListReversal 
{
	    public static void main(String[] args) {
	        List<String> originalList = new ArrayList<>();
	        originalList.add("apple");
	        originalList.add("banana");
	        originalList.add("cherry");
	        originalList.add("date");
	        
	        //Printing original list.
	        System.out.println("Original List:"+originalList);

	        // Using Java Collections method (Collections.reverse)
	        List<String> reversedList1 = new ArrayList<>(originalList);
	        Collections.reverse(reversedList1);
	        System.out.println("Reversed list using Collections.reverse: " + reversedList1);

	        // Using logic (iterating backwards and appending to a new list)
	        List<String> reversedList2 = new ArrayList<>();
	        for (int i = originalList.size() - 1; i >= 0; i--) {
	            reversedList2.add(originalList.get(i));
	        }
	        System.out.println("Reversed list using logic: " + reversedList2);
	    }
	}


