import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class UpdateOBBank {
     static Statement stmt = null;
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OneBillBankDB?","onebill","onebill");
			String query = "Update Employee set empname = 'Ratna' where empid=101";
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
