package com.bridgelabz.collections;

import java.util.*;

public class JavaCollectionDemo {
	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();
	}
	
	public static void doListDemo() {
		System.out.println("In listdemo");
		List<String> list = new LinkedList<String>();
		
		list.add("ravi");
		list.add("raj");
		list.add("shastri");
		list.add("suresh");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
	}
	
	public static void doStackDemo() {
		System.out.println("In Stackdemo");
		Stack<String> stack = new Stack<String>();
		
		stack.push("ravi");
		stack.push("raj");
		stack.push("shastri");
		stack.push("suresh");
		
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
	}
	
	public static void doQueueDemo() {
		System.out.println("In QueueDemo");
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("ravi");
		queue.add("raj");
		queue.add("shastri");
		queue.add("suresh");
		
		System.out.println("head : "+queue.peek());
		System.out.println("head : "+queue.element());
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing 2 elements");
		Iterator<String> itr2 = queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println();
	}
	
	public static void doSetDemo() {
		System.out.println("In SetDemo");
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("ravi");
		set.add("raj");
		set.add("shastri");
		set.add("suresh");
		
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println();
	}
	
	public static void doMapDemo() {
		System.out.println("In mapdemo");
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(100, "ravi");
		hashMap.put(101, "shastri");
		hashMap.put(102, "rahul");
		
		for(Map.Entry m: hashMap.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
}
