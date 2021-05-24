package com.corejava.assignments;

import com.corejava.assignments.A.Message1;

class A{  //class inside interface
	interface Message1{
		void display();
	}
}
interface Showable{ //interface inside an interface
	void show();
	interface Message{
		void msg();
	}
}
public class NestedInterface extends A implements Showable.Message, Message1 {
	public void display() {
		System.out.println("Nested Interface using class inside interface");
	}
	public void msg() {
		System.out.println("Nested Interface using interface inside interface");
	}
	public static void main(String[] args) {
       Showable.Message message = new NestedInterface();
       message.msg();
       A.Message1 m1 = new NestedInterface();
       m1.display();
	}

}
