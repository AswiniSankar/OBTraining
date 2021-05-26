package com.corejava.basics.day7.exceptionhandling;

@SuppressWarnings("serial")
class CustomExp extends Exception {

	public CustomExp(String s) {
		// Call constructor of parent Exception
		super(s);
	}

}

public class CustomException {

	public static void main(String[] args) {
	
		try {
			// Throw an object of user defined exception
			throw new CustomExp("Exception of array");
		} catch (CustomExp ex) {
			System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}

}
