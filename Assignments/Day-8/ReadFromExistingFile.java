package com.corejava.assignments.day8.threads;

import java.io.FileReader;
import java.io.IOException;

public class ReadFromExistingFile {

	public static void main(String[] args) {
		 
	          try {
	        	   FileReader fr=new FileReader("/home/aswini/Documents/fileread.txt");//creating file pointer    
	 	          int i;   
				while((i=fr.read())!=-1)  //reading the content  
				  System.out.print((char)i);//printing the content
				 fr.close();    


			} catch (IOException e) {
			
				e.printStackTrace();
			}    
	         	}

}
