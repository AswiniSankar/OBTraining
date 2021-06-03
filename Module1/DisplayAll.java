package com.onebill.javatraining.moduleprogram.musicapp.consolebased;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayAll {
	 Connection con = null;
	 Statement stmt = null;
	 ResultSet rs = null;
	public  DisplayAll() throws ClassNotFoundException, InterruptedException {
		try {
			 
				Class.forName("com.mysql.jdbc.Driver");
	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer","onebill","onebill");
			String query = "select * from MusicFiles order by  Song_Title ";
			
		      stmt= con.createStatement();
		      rs= stmt.executeQuery(query);
		
		      while(rs.next()) {	
					System.out.println(rs.getString("Song_Title") +"\t"+rs.getString("Artist_Name")+"\t"+rs.getString("Album_Name")+"\t"+rs.getString("Song_Location") +"\t"+rs.getString("Description") );
					
				} 
			
		
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				System.out.println("error in finally");
			}
		}

	
		
	}

}
