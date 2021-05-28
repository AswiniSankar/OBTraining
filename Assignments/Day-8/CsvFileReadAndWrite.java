package com.corejava.assignments.day8.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvFileReadAndWrite {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("/home/aswini/Documents/javacsv.csv"));
			sc.useDelimiter(",");   //sets the delimiter pattern  
			while (sc.hasNext())  //returns a boolean value  
			{  
			System.out.print(sc.next());  //find and returns the next complete token from this scanner  
			}   
			sc.close();  //closes the scanner  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	
	}

}
