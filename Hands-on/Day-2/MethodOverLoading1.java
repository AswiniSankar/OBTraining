package com.corejava.basics;

class Method1 { // vary number of parameters
	public void display(int a, int b) {
		System.out.println(a + " " + b);
	}

	public void display(int a) {
		System.out.println(a);
	}

	public void display(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
}

class Method2 { // vary the types of parameter
	public void display(int a) {
		System.out.println(a);
	}

	public void display(int a, double b) {
		System.out.println(a + " " + b);
	}

	public void display(char a, int b) {
		System.out.println(a + " " + b);
	}
}

class Method3 { // order of parameters
	public void display(char a, int b) {
		System.out.println(a + " " + b);
	}

	public void display(int b, char a) {
		System.out.println(a + " " + b);
	}
}

public class MethodOverLoading1 {

	public static void main(String[] args) {

		Method1 obj1 = new Method1();
		obj1.display(3);
		obj1.display(3, 10);
		obj1.display(10, 4, 19);

		Method2 obj2 = new Method2();
		obj2.display(5);
		obj2.display(4, 3.90);
		obj2.display('r', 10);

		Method3 obj3 = new Method3();
		obj3.display('f', 5);
		obj3.display(10, 'u');

	}

}
