import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicDelete {
	static Connection con = null;
	static PreparedStatement pstmt = null;

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebillstudent?", "onebill", "onebill");

			String query = "delete from student where sid =? ";

			pstmt = con.prepareStatement(query);
			System.out.println("enter the student that you want to delete....");
			Scanner s = new Scanner(System.in);
			int sid = s.nextInt();

			pstmt.setInt(1, sid);
			pstmt.executeUpdate();
			System.out.println("deleted successfully.. ");
			s.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				System.out.println("exception..");
			}
		}
	}

}
