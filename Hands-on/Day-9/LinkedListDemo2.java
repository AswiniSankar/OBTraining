package com.corejava.basics.day9.collections;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
  LinkedList<String> linkedList = new LinkedList<>();
  linkedList.add("java");
  linkedList.add("python");
  linkedList.add("html");
  linkedList.add("c");
  linkedList.add(".net");
  System.out.println("Programing languages are :" +linkedList);
  
  System.out.println(linkedList.get(1));//get the value using index
  linkedList.set(2, "SQL");//change the value
  System.out.println(linkedList);
	}

}
