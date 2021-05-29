package com.corejava.basics.day10.java8features;

interface FunctionalInt {
	void abstractMethodDemo(int i);
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInt ref = (int i) -> {
			System.out.println("interger value is " + i);
		};
		ref.abstractMethodDemo(10);
	}

}
