package com.corejava.assignments.day8.threads;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendingFile {

	public static void main(String[] args) {
	
			File file = new File("/home/aswini/Documents/append.txt");
		
			String text = "java programing";
			try {
				// Below constructor argument decides whether to append or override
				FileWriter fr1 = new FileWriter(file, true);
				
				fr1.write(text);
				fr1.close();

			} catch (IOException e) {
				e.printStackTrace();
			} 
			System.out.println("successfully  executed...");
			
	}

}
