package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Driver {
	public static void main(String[] args) throws ClassNotFoundException {
		jdbc();
	}

	static void jdbc() {
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=Asia/Manila&useSSL=false","root","Password1")) {
			PreparedStatement stmt = conn.prepareStatement("select * from sys_config");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString(1);
				String col2 = rs.getString(2);
				System.err.println(name +  " : " + col2);
			}
			         

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
