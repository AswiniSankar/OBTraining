import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Connection;

public class InsertIntoOBBank {
	static Statement stmt = null;

	public static void main(String[] args) {

		String URL = "jdbc:mysql://localhost/OneBillBankDB";
		Properties info = new Properties();
		info.put("user", "onebill");
		info.put("password", "onebill");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(URL, info);
			String query = "insert into Employee values(101,'Ragu',30000)";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				System.out.println("exception..");
			}
		}
	}

}
