package com.corejava.basics;
class person{
	String name;
	String address;
	public person() {
		
		this.name = "name";
		this.address = "address";
	}
public person(String name) {
		this();
		this.name = name;
	
	}
public person(String name, String address) {
	
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "person [name=" + name + ", address=" + address + "]";
}
	
}
public class DifferentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    person o1= new person();
    person o2= new person("kumar");
    person o3= new person("meena","INDIA");

    System.out.println(o1.toString());
    System.out.println(o2.toString());
    System.out.println(o3.toString());

    
	}

}
