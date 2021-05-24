package com.corejava.basics;

// demonstrating interface inside an interface

interface Outer {
	interface Inner {
		void insideInnerInterface();
	}

	void outerInnerInterface();

}

class Demo implements Outer.Inner, Outer {

	@Override
	public void outerInnerInterface() {
		System.out.println("Inner interface");
	}

	@Override
	public void insideInnerInterface() {
		System.out.println("outer interface");

	}

}

public class InterfaceInsideInterface {

	public static void main(String[] args) {
		Outer outer;
		Outer.Inner inner;
		Demo demo = new Demo();
		outer = demo;
		inner = demo;
		outer.outerInnerInterface();
		inner.insideInnerInterface();

	}

}
