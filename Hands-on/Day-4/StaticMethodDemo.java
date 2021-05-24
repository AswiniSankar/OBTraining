package com.corejava.basics;

class Empdetail{
	int empid;
	String empname;
	static String companyname ="One Bill";
	static void changename() {
     companyname="Test Yantra";
	}
	public Empdetail(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}
  void display() {
	  System.out.println(empid+" "+empname+" "+ companyname);
  }
  
	
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		Empdetail o1 = new Empdetail(123, "aswini");
		o1.display();
	    Empdetail.changename(); //static method called
		Empdetail o2 = new Empdetail(343, "karthika");
		o2.display();
		Empdetail o3 = new Empdetail(143, "Rahul");
		o3.display();
	}

}
