package com.onebill.javatraining.moduleprogram.musicapp.consolebased;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SelectionOfSongs {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void Display(char ch) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "onebill", "onebill");
			String query;
			if (ch == 'A' || ch == 'B') {
				if (ch == 'A') {
					query = "select * from MusicFiles";
				} else {
					query = "select * from MusicFiles order by RAND()";
				}
				stmt = con.createStatement();
				rs = stmt.executeQuery(query);
				PrintSongs(rs);
			} else if (ch == 'C') {
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the song name");
				String song = s.nextLine();
				query = "select * from MusicFiles where  Song_Title =?";
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, song);
				rs = pstmt.executeQuery();

				PrintSongs(rs);
				s.close();
			}

		} catch (Exception e) {
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
				e.printStackTrace();
			}

		}
	}

	void PrintSongs(ResultSet rs) throws InterruptedException {
		try {
			int flag = 0;
			while (rs.next()) {

				System.out.println(rs.getString("Song_Title") + "\t" + rs.getString("Artist_Name") + "\t"
						+ rs.getString("Album_Name") + "\t" + rs.getString("Song_Location") + "\t"
						+ rs.getString("Description"));
				TimeUnit.SECONDS.sleep(5);
				flag = 1;
			}
			if (flag == 0) {
				System.out.println("sorry song not found..");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
