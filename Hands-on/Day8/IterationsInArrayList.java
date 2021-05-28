package com.corejava.basics.day8.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterationsInArrayList {

	public static void main(String[] args) {
	  ArrayList<Integer> arrayList = new ArrayList<>();
	  arrayList.add(10);
	  arrayList.add(20);
	  arrayList.add(30);
	  arrayList.add(40);
	  arrayList.add(50);
	  System.out.println("--------without using for loop-------");
	  System.out.println(arrayList);
	  System.out.println("--------using for loop--------------");
	  for(int i=0;i<arrayList.size();i++) {
		  System.out.println(arrayList.get(i));
	  }
	  System.out.println("--------using for each loop--------------");
	  for(Integer i : arrayList) {
		  System.out.println(i);
	  }
	  System.out.println("--------using iterator--------");
	  Iterator<Integer> iterator = arrayList.iterator();
		
	  while(iterator.hasNext()) {
		  System.out.println(iterator.next());
	  }
	  System.out.println("--------using listiterator(forward)--------");

      ListIterator<Integer> listIterator = arrayList.listIterator();
      while(listIterator.hasNext()) {
    	  System.out.println(listIterator.next());
      }
	  System.out.println("--------using listiterator(backward)--------");

      ListIterator<Integer> listIterator1 = arrayList.listIterator(arrayList.size());
      while(listIterator1.hasPrevious()) {
    	  System.out.println(listIterator1.previous());
      }
	}

}
