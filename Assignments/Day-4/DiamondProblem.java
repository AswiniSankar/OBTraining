package com.corejava.assignments;

interface Interface1 {
	public default void display() {
		System.out.println("Interface1");
	}
}

interface Interface2 {
	public default void display() {
		System.out.println("Interface2");
	}
}

interface Interface3 extends Interface1 {

}

interface Interface4 extends Interface1 {

}

public class DiamondProblem implements Interface1, Interface2 {

	public void display() {
		Interface1.super.display();
		Interface2.super.display();
	}

	public static void main(String[] args) {
		DiamondProblem dm = new DiamondProblem();
		dm.display();
	}

}
