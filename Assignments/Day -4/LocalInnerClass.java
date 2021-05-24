package com.corejava.assignments;
//a class created inside the method of another class
class OuterLocalClass{
	int data;
	void print() {
	class InnerLocalClass{
		private int value =50;//instance variable
		void display1() {
			System.out.println("the value of data is :"+data);
		}
		void display2() {
			System.out.println("the value of data is :"+value);
		}
	}
	InnerLocalClass o1 = new InnerLocalClass();
	o1.display1(); //invoked inside the method
    o1.display2();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
       OuterLocalClass ob= new OuterLocalClass();
       ob.data=40;
       ob.print();
	}

}
