package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import model.AdminMenu;

public class AdminMenuDAO extends DBContext {
	public List<AdminMenu> getAll() {
		List<AdminMenu> list = new ArrayList<AdminMenu>();
		String sql = "SELECT * FROM hionfasdb.adminmenu;";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				AdminMenu mn = new AdminMenu(rs.getInt(1),
											 rs.getString(2),
											 rs.getInt(3),
											 rs.getInt(4),
											 rs.getString(5),
											 rs.getString(6));
				list.add(mn);
			}
			ps.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
