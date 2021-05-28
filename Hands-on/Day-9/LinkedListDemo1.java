package com.corejava.basics.day9.collections;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(13);
		list.add(12);
		System.out.println(list);
        System.out.println("-----with index-----");
        list.add(0, 14);
        list.add(4, 20);
		System.out.println(list);
		  System.out.println("-----set at index-----");
		     list.set(2, 100);
				System.out.println(list);
        System.out.println("------remove index and remove object-----");
        list.remove();
        list.remove(1);
        list.remove(new Integer(12));
		System.out.println(list);
   
		list.add(30);
		list.add(40);
     LinkedList<Integer> ls = new LinkedList<>();
     ls.add(12);
     ls.add(13);
		System.out.println(list);
		System.out.println(ls);

     System.out.println(list.containsAll(ls));//ls checks for all the elements in list
     list.addFirst(120);
		System.out.println(list);
list.addLast(200);
System.out.println(list);

     
	}

}
