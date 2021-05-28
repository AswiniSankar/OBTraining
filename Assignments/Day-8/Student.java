package com.corejava.assignments.day8.threads;

class Student implements java.io.Serializable{
	 private static final long serialVersionUID=1L;  
	 int id;  //transient  is used when we didn't want to serialize and while deserialize prints values based on data type here it is 0 
	 String name;  
	static String school ="java training school"; //can't serialize the static member
	public Student(int id2, String name2) {
		// TODO Auto-generated constructor stub
		  this.id = id2;  
		  this.name = name2;  
	}
	
}