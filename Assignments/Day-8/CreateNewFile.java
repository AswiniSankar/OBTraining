package com.corejava.assignments.day8.threads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class CreateNewFile {

	public static void main(String[] args) {
		try{    
			File file1 = new File("/home/aswini/Documents/newtext.txt"); //new file created 
	        file1.createNewFile();
	        FileWriter fw=new FileWriter(file1); //write by using file writer   
	           fw.write("A new file is created and content is added...");    
	           fw.close();    
	           System.out.println("Successfully writen ...");    
	          FileInputStream fin=new FileInputStream("/home/aswini/Documents/fileread.txt"); //read by stream   
	          int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
		           System.out.println("successfully readed");

	          }catch(Exception e){System.out.println(e);}    
	        
		

	}

}
