package com.corejava.basics;
class OuterDemo{
	private class InnerDemmo{
		void display() {
			System.out.println("inner demo");
		}
	}
	void print() {
		InnerDemmo innerDemmo = new InnerDemmo();
		innerDemmo.display();
	}
}
public class AccessingPrivateClassInsideClass {

	public static void main(String[] args) {
		OuterDemo outerDemo = new OuterDemo();
		outerDemo.print();

	}

}
