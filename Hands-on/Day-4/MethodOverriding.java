package com.corejava.basics;
class BaseClass{
	void display() {
		System.out.println("This is display inside base class...");
	}
}
class SubClass extends BaseClass{
	void display() {
		System.out.println("This is display inside sub class...");
	}
}

public class MethodOverriding{
	public static void main(String[] args) {
	 
		BaseClass baseClass = new SubClass();
	    baseClass.display();//base class is pointing to its subclass
	    SubClass subClass = new SubClass();
	    subClass.display();//base class get override
	    
	}

}
