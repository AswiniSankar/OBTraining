package com.corejava.assignments.day9.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
 
     LinkedHashSet<Books> lh = new LinkedHashSet<>();
      
     lh.add(new Books(123, "Harry Potter", "J K Rowling"));
     lh.add(new Books(101,"Let us C","Yashwant Kanetkar"));  
     lh.add(new Books(102,"Data Communications & Networking","Forouzan"));  
   
     TreeSet<Books> ts = new TreeSet<>(new SortByAuthorName());
     ts.addAll(lh);
     Iterator< Books> iter = ts.iterator();
     while(iter.hasNext()) {
    	 System.out.println(iter.next());
     }
	}

}
