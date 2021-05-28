package com.corejava.assignments.day8.threads;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class Serializable {

	public static void main(String[] args) {
		try{  
			  //Creating the object
			  
			  Student s1 =new Student(123,"aswini");  
			  //Creating stream and writing the object  
			  FileOutputStream fout=new FileOutputStream("/home/aswini/Documents/abc1.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  out.writeObject(s1);  
			  out.flush();  
			  //closing the stream  
			  out.close();  
			 
			  System.out.println("Successfully serialized.....");  
			  }
		  catch(Exception e){System.out.println(e);}  

	}

}
