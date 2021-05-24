package com.corejava.assignments;

//an anonymous inner class is created using class
abstract class Person {
	abstract void run();
}

public class AnonymousInnerClassByClass {

	public static void main(String[] args) {
		Person p = new Person() { // a class is created

			@Override
			void run() {
				System.out.println("This person is running....");
			}
		};
		p.run();
	}

}
