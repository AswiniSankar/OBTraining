package com.corejava.basics;

class Test {
	interface Demo {
		void Show();
	}
}

class Testing implements Test.Demo {

	@Override
	public void Show() {
		System.out.println("interface inside a class");
	}

}

public class InterfaceInsideClass {

	public static void main(String[] args) {
		Test.Demo demo = new Testing();
		demo.Show();

	}

}
