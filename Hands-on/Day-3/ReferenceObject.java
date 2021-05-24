package com.corejava.basics;

class Class1 {
	int number = 20;

	boolean display() {
		System.out.println("another class");
		return true;
	}
}

public class ReferenceObject {

	public static void main(String[] args) {

		Class1 obj = new Class1();
		obj.number = 30;
		Class1 obj1 = new Class1();
		obj1 = obj;
		obj1.display();
		System.out.println(obj1.number);

	}

}
