package com.onebill.javatraining.moduleprogram.musicapp.consolebased;

import java.util.Scanner;

public class MusicAPP {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
	
		char start ='y';
		int choice;
		char option = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(start=='y') {
		
			System.out.println("1.Play a Song 2.Search a Song3.Show all Songs 4.Operate on Songs Database 5.exit");
			System.out.println("enter your choice");
			choice = s.nextInt();
			switch(choice) {
			case 1:
				   SelectionOfSongs ref1 = new SelectionOfSongs();
				System.out.println("A.Play all song B.Play Songs Randomly C.Play a Particular Song D.exit");
				System.out.println("enter your option");
			    option = s.next().charAt(0);
			 
			  switch(option) {
			  case 'A':
				 
				  ref1.Display('A');
				  break;
			  case 'B':	  ref1.Display('B');break;
			  case 'C':
				       ref1.Display('C');
				      break;
			  case 'D': System.exit(0);
			  default : System.out.println("invalid option");break;
			  }
			  break;
			  case 2: 
				 @SuppressWarnings("unused") 
				 SearchSong ref2 = new SearchSong(); 
				  break;
			  case 3:
				  @SuppressWarnings("unused") DisplayAll ref3= new  DisplayAll(); break;
			  case 4:
				  System.out.println("A. Add Song B. Edit an existing Song  C. Delete an existing Song" );
				  System.out.println("enter your option");
				  option = s.next().charAt(0);
				
				  switch (option) {
				  case 'A':
					  @SuppressWarnings("unused") 
					  Changes ref4 = new Changes();
					 ref4.insert();
					
					  break;
				  case 'B': Changes ref5 = new Changes();
				            ref5.update();break;
				  case 'C': Changes ref6 = new Changes();
					 ref6.delete();break;
				  }
				   break;
			  case 5:System.exit(0);
			  default : System.out.println("invalid option");break;
			}
		
		}
	}

}
