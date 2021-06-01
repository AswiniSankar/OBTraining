import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticDelete {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		Statement stmt = null;
		// 1.load the drive
		try {

		
				Class.forName("com.mysql.jdbc.Driver");
		
			// 2.get db connection via driver
			String db_url = "jdbc:mysql://localhost:3306/onebillstudent?user=onebill&password=onebill";

			con = DriverManager.getConnection(db_url);
			// 3.issue a sql queries via connection
			String query = "delete from student where sid=2";

			stmt = con.createStatement();
			// 4.process the resultset returned by the sql queries
			int count = stmt.executeUpdate(query);
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 5.close all jdbc objects
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				System.out.println("exception..");
			}
		}

	}

}
