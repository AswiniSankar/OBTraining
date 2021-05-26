package com.corejava.basics.day7.exceptionhandling;

public class FinallyDemo1 {

	public static void main(String[] args) {
	   try {
		   int result = 25/0;
		   System.out.println("the value is :"+ result);
	   }catch(Exception e){
		   System.out.println("can't divided by zero");
	   }finally {
		   System.out.println("always executed...");
	   }

	}

}
