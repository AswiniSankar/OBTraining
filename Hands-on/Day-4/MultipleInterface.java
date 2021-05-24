package com.corejava.basics;

// demonstrating multiple interface extension
interface MyIterface1 {
	void method1();
}

interface MyIterface2 {
	void method2();
}

interface MyIterface3 extends MyIterface1, MyIterface2 {
	void method3();
}

public class MultipleInterface implements MyIterface3 {

	public static void main(String[] args) {
		MultipleInterface multipleInterface = new MultipleInterface();
		multipleInterface.method1();
		multipleInterface.method2();
		multipleInterface.method3();

	}

	@Override
	public void method1() {
		System.out.println("interface1 method");
	}

	@Override
	public void method2() {
		System.out.println("interface2 method");

	}

	@Override
	public void method3() {
		System.out.println("interface3 method");

	}

}
