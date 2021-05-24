package com.corejava.basics;

public class StaticBlockDemo {
  static {
	  //mostly used for static data member initialization
	  //it is not possible to use method inside it 
	  System.out.println("invoking static block");
  }
	public static void main(String[] args) {
		System.out.println("invoking main method");
		
	}

}
