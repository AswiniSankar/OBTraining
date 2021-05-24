package com.corejava.basics;

interface MyInterface {
	void interfaceMethod1();

	void interfaceMethod2();
}

public class SimpleInterfaceDemo implements MyInterface {

	public static void main(String[] args) {
		MyInterface myInterface = new SimpleInterfaceDemo();
		myInterface.interfaceMethod1();
		myInterface.interfaceMethod2();
	}

	@Override
	public void interfaceMethod1() {
		System.out.println("myinterface method1");
	}

	@Override
	public void interfaceMethod2() {
		System.out.println("myinterface method1");
	}

}
