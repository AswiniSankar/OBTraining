package com.corejava.basics.day7.exceptionhandling;
class ExceptionTest{
	static void generateException() {
		int [] numbers = new int[3];
		System.out.println("before exception");
		
		numbers[4]=20;
		System.out.println("this won't print");
	}
}
public class TryCatchDemo2 {

	public static void main(String[] args) {

		try {
			ExceptionTest.generateException();
		}
		catch (Exception e) { //type of exception can also be specify
System.out.println("array out of index");  //in place of out err also replace
}
		System.out.println("end of program");
		System.out.println("other business logic");
	}

}
