package com.corejava.assignments.day10;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	public Student(int id, String name, int mark, int age) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.age = age;
	}

	int id;
	String name;
	int mark;
	int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + ", age=" + age + "]";
	}
	@Override
	public int compare(Student o1, Student o2) {
		
		return 0;
	}
	

}
