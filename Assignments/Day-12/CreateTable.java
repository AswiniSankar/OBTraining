import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/OneBillBankDB", "onebill", "onebill");
			Statement stmt = con.createStatement();
			String query = "create table Employee (empid int primary key not NULL, empname varchar(50),empsalary int)";
			stmt.executeUpdate(query);
			System.out.println("Table created succesfully...");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
