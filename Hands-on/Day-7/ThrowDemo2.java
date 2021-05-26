package com.corejava.basics.day7.exceptionhandling;

public class ThrowDemo2 {
   static void validate(int age) {
	   if(age<18) {
		   throw new ArithmeticException("not eligible to vote");
	   }else
	   {
		   System.out.println("Welcome you to cast your voting....");
	   }
   }
	public static void main(String[] args) {
		try {
			validate(12);
		}catch (ArithmeticException  e) {
       System.out.println("not permit to vote");
       System.out.println(e.getMessage());
		}
	System.out.println("validation is completd");
	}

}
