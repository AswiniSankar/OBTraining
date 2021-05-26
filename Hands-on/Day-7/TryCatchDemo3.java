package com.corejava.basics.day7.exceptionhandling;

public class TryCatchDemo3 {

	public static void main(String[] args) {
		 int[] array = new int[4];
		  try {
			  System.out.println("before");
			  array[5]=10;
			  System.out.println("after");//won't execute
			  
		  }catch (ArrayIndexOutOfBoundsException e) {//in place of exception Throwable also given
	       System.err.println("array out of index");
	  
	       
		  }

	}

}
