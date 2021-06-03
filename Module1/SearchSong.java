package com.onebill.javatraining.moduleprogram.musicapp.consolebased;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SearchSong extends SelectionOfSongs {
	
	 Connection con = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;

   public SearchSong( ) throws InterruptedException, ClassNotFoundException {
		// TODO Auto-generated constructor stub
	
		try {
			  Scanner sc = new Scanner(System.in);
				Class.forName("com.mysql.jdbc.Driver");
	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer","onebill","onebill");
			String query = "select * from MusicFiles where Song_Title =?";
			 System.out.println("enter the song name");
			 String songname = sc.nextLine();
		      pstmt= con.prepareStatement(query);
		      pstmt.setString(1, songname);
		      rs= pstmt.executeQuery();
			int flag=0,playid;
			System.out.println("Song_Location             |           Song_Title     |   Artist_Name                       | Album_Name      |       Play _ID");
			while (rs.next()) {
				playid = rs.getInt("Song_ID");
				System.out.println((rs.getString("Song_Location")+"\t"+rs.getString("Song_Title") +"\t"+rs.getString("Artist_Name")+"\t"+rs.getString("Album_Name")+ playid * 10 ));
				 flag=1;
			} 
			
			
			if(flag==0){
				System.out.println("no record");
			}
			else {
				System.out.println("enter the play id of which song you want to play ");
				int pid= sc.nextInt();
				int songid= pid/10;
				
				String query1= "select * from MusicFiles where Song_ID =?";
				pstmt=con.prepareStatement(query1);
				pstmt.setInt(1, songid);
				rs=pstmt.executeQuery();
				if(rs.next()) {
					System.out.println(rs.getString("Song_Title") +"\t"+rs.getString("Artist_Name")+"\t"+rs.getString("Album_Name"));
					 TimeUnit.SECONDS.sleep(5);
				}
		       
				sc.close();
		
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				System.out.println("error in finally");
			}
		}

	}
}


