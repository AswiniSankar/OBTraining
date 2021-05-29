package com.corejava.basics.day10.java8features;

interface FunctionalInt1 { // inside a interface we can have these methods
	void abstractMethodDemo(int i);

	// java 2.8 feature
	default void normalMethod() {
		System.out.println("Hello inside normal method()");
	}

	// java 2.8 feature
	static void staticMethod() {
		System.out.println("Hello inside statis method()");

	}
}

public class LambdaDemo3 {

	public static void main(String[] args) {
		FunctionalInt1 ref = (int x) -> {
			System.out.println("hello from abstact method... " + x);
		};
		ref.abstractMethodDemo(30);
		ref.normalMethod();
		FunctionalInt1.staticMethod();
	}

}
