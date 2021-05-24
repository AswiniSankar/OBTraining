package com.corejava.basics;
class Employee{
	int empid;
	String empname;
	static String companyname ="One Bill";
	public Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}
  void display() {
	  System.out.println(empid+" "+empname+" "+ companyname);
  }
  
	
}
public class StaticVariableDemo {
	public static void main(String[] args) {
		Employee o1 = new Employee(123, "aswini");
		o1.display();
		Employee.companyname= "Test Yantra"; //class level change 
		Employee o2 = new Employee(343, "karthika");
		o2.display();

	}

}
