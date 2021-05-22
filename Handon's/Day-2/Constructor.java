package com.corejava.basics;
class Student{
	int rollno;
	String name;
	float fees;
	Student(int rollno, String name, float fees){
		this.rollno=rollno;
		this.name=name;
		this.fees=fees;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fees);
	}
}
public class Constructor {

	public static void main(String[] args) {
		Student obj=new Student(123,"aswini",4000f);
        obj.display();
	}

}
