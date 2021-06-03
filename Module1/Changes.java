package com.onebill.javatraining.moduleprogram.musicapp.consolebased;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Changes {
	Connection con = null;
	PreparedStatement pstmt = null;

	public void insert() {
		try {
			Scanner s = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "onebill", "onebill");
			String query;

			query = "insert into MusicFiles (Song_Title,Artist_Name,Album_Name,Song_Location,Description) values(?,?,?,?,?)";

			pstmt = con.prepareStatement(query);
			System.out.println("enter the song title");
			String stitle = s.nextLine();
			System.out.println("enter the Artist name");
			String sname = s.nextLine();
			System.out.println("enter the album name");
			String aname = s.nextLine();
			System.out.println("enter the song location");
			String sloc = s.nextLine();
			System.out.println("enter the description");
			String des = s.nextLine();
			pstmt.setString(1, stitle);
			pstmt.setString(2, sname);
			pstmt.setString(3, aname);
			pstmt.setString(4, sloc);
			pstmt.setString(5, des);

			pstmt.executeUpdate();
			System.out.println("inserted successfully...");

			s.close();
		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	void delete() {
		try {
			Scanner s = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "onebill", "onebill");
			String query;

			query = "delete from MusicFiles where Song_Title=? and Artist_Name=? and Album_Name =?";

			pstmt = con.prepareStatement(query);
			System.out.println("enter the song title");
			String stitle = s.nextLine();
			System.out.println("enter the Artist name");
			String sname = s.nextLine();
			System.out.println("enter the album name");
			String aname = s.nextLine();
			pstmt.setString(1, stitle);
			pstmt.setString(2, sname);
			pstmt.setString(3, aname);

			pstmt.executeUpdate();
			System.out.println("deleted successfully...");

			s.close();
		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	void update() {
		try {
			Scanner s = new Scanner(System.in);
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MusicPlayer", "onebill", "onebill");
			String query;

			query = "update MusicFiles set Song_Title =? where Artist_Name=? and Album_Name=?";

			pstmt = con.prepareStatement(query);
			System.out.println("enter the new  song title");
			String stitle = s.nextLine();
			System.out.println("enter the Artist name");
			String sname = s.nextLine();
			System.out.println("enter the album name");
			String aname = s.nextLine();
			pstmt.setString(1, stitle);
			pstmt.setString(2, sname);
			pstmt.setString(3, aname);

			pstmt.executeUpdate();
			System.out.println("updated successfully...");

			s.close();

		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
