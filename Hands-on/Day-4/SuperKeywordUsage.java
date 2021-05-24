package com.corejava.basics;
class Animal{
	String color = "black";
}
class Dog extends Animal{
	String color = "brown";
	void display() {
		System.out.println("color in subclass: "+ color); //prints color of Dog class
		System.out.println("color in superclass: "+ super.color);//prints color of Animal class
	}
}
public class SuperKeywordUsage {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.display();
		dog.color="pink"; //object level interface
		dog.display();
	

	}

}
