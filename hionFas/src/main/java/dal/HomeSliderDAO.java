package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.HomeSlider;

public class HomeSliderDAO extends DBContext{

	public List<HomeSlider> getAll() {
		List<HomeSlider> list = new ArrayList<>();
		String sql = "SELECT * FROM hionfasdb.homeslider;";
				
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				HomeSlider s = new HomeSlider(rs.getInt(1),
											  rs.getString(2),
											  rs.getString(3),
											  rs.getString(4),
											  rs.getString(5));
				list.add(s);
			}
			st.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
