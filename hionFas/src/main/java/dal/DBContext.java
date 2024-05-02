package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
	 protected Connection connection;

	 public DBContext() {
		 String name = "root";
		 String pass = "123456";
		 String url = "jdbc:mysql://localhost:3306/hionfasdb";
		 
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection(url, name, pass);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
}

