package com.corejava.basics.day10.java8features;

interface MyInterface {
	void display();
}

// only applicable for functional interface only
public class LambdaDemo1 {

	public static void main(String[] args) {
		MyInterface ref = () -> { // lambda expression
			System.out.println("Inside my interface...");
		};// boilerplate code
		ref.display();
	}

}
