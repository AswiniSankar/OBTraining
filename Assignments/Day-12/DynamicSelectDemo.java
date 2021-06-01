import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicSelectDemo {
	static Connection con = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {

		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent?", "onebill", "onebill");
			String query = "select * from student where sid=? ";

			int s_id = Integer.parseInt(args[0]);
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, s_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int Student_id = rs.getInt("sid");
				String Student_name = rs.getString("name");
				int Stuudent_mark = rs.getInt("mark");
				System.out.println(Student_id + "  " + Student_name + "  " + Stuudent_mark);
			} else {
				System.out.println("no record");
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
