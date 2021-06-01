import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/","onebill","onebill");
			Statement stmt = con.createStatement();
			String query = "create database OneBillBankDB";
			stmt.executeUpdate(query);
			System.out.println("Data base created succesfully...");
		}catch (Exception e) {
           e.printStackTrace();
           
		}

	}

}
