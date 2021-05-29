package com.corejava.assignments.day9.collections;

public class Person implements Comparable<Person> {
	int id;
    String pname;
    
	public Person(int id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() { //converting object to string
		return "Person [id=" + id + ", pname=" + pname + "]";
	}

	
	@Override
	public int hashCode() {
		
		return this.id;
	}

	@Override
	public int compareTo(Person o) {
		
		//return this.id - o.id;//ascending 
		return o.id - this.id;//Descending
	}

	
	

}
