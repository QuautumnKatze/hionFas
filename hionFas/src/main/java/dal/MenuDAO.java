package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Menu;



public class MenuDAO extends DBContext {
	public List<Menu> getAll() {
		List<Menu> list = new ArrayList<Menu>();
		String sql = "SELECT * FROM hionfasdb.menu";
		
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				Menu m = new Menu(rs.getInt(1),
								  rs.getString(2),
								  rs.getInt(3),
								  rs.getInt(4),
								  rs.getString(5));
				list.add(m);
			}
			st.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
}
