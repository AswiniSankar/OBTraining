package com.corejava.basics;


class Outer1{
	class Inner{
		public void display() {
			System.out.println("inner class");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
       Outer1.Inner inner = new Outer1(). new Inner();
       inner.display();
	}

}
