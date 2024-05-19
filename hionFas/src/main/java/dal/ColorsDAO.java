package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Colors;

public class ColorsDAO extends DBContext {
	public List<Colors> getAll() {
		List<Colors> list = new ArrayList<Colors>();
		String sql = "SELECT * FROM hionfasdb.colors;";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Colors c = new Colors(rs.getInt(1),
									  rs.getString(2));
				list.add(c);
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

}
