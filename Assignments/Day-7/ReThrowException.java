package com.corejava.assignments.day7.exceptionalhandling;

public class ReThrowException {
	 public static void method1() throws Exception {
	      System.out.println("The Exception in  method1() method");
	      throw new Exception("thrown from  method1() method");
	   }
	  public static void method2() throws Throwable {
	      try {
	         method1();
	      } catch(Exception e) {
	         System.out.println("Inside  method2() method");
	         throw e;
	      }
	   }
	public static void main(String[] args) throws Throwable {
		 try {
	         method2();
	      } catch(Exception e) {
	         System.out.println("Caught in main method");
	      }

	}

}
