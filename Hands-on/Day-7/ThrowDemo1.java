package com.corejava.basics.day7.exceptionhandling;

public class ThrowDemo1 {

	public static void main(String[] args) {
	try {
		System.out.println("before exception");
		throw new ArithmeticException();
	}catch (ArithmeticException e) {
   System.out.println("Arithmetic Exception");
	}
	System.out.println("completed...");
		
	}

}
