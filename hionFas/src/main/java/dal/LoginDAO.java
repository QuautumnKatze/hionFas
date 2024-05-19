package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Login;

public class LoginDAO extends DBContext {
	public Login check(String userName, String passWord) {
		String sql = "SELECT `account`.`accountID`,\r\n" + "    `account`.`userName`,\r\n"
				+ "    `account`.`passWord`,\r\n" + "    `account`.`FullName`,\r\n" + "    `account`.`doB`,\r\n"
				+ "    `account`.`address`,\r\n" + "    `account`.`profilePic`,\r\n" + "    `account`.`role`\r\n"
				+ "FROM `hionfasdb`.`account` where `userName` = ? and `passWord` =?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, passWord);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				Login l = new Login(rs.getInt("accountID"), rs.getString("userName"), rs.getString("passWord"),
						rs.getString("fullName"), rs.getDate("doB"), rs.getString("address"),
						rs.getString("profilePic"), rs.getInt("role"));
				return l;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void main(String[] args) { System.out.println(check("admin",
	 "123456")); }
	 
}
