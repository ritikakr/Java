package com.queue;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        PriorityQueue p = new PriorityQueue();
        
        p.add("Java");
        p.add("Python");
        p.add("JavaScript");
        p.add("PHP");
        p.offer("React");
        p.offer("HTML");
        System.out.println(p.offer("ritika"));
        
        System.out.println("Queue elements are:"+p);
        
        p.remove();
        System.out.println("After using remove method:"+p);
        
        p.poll();
        System.out.println("After using poll method:"+p);
        
        System.out.println(p.element());
        System.out.println(p);
        
        System.out.println(p.peek());
        System.out.println(p);
        
        PriorityQueue p2 = new PriorityQueue();
        
        p2.add(100);
        System.out.println(p2);
        
        p2.offer(20);
        System.out.println(p2);
        p2.remove();
        System.out.println(p2);
        
        
      
        
	}

}
