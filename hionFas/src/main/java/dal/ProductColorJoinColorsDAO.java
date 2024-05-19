package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.ProductColorJoinColors;

public class ProductColorJoinColorsDAO extends DBContext {
	public List<ProductColorJoinColors> getAll() {
		List<ProductColorJoinColors> list = new ArrayList<ProductColorJoinColors>();
		String sql = "SELECT PColorID, ProductID, productcolor.ColorID, ColorName FROM productcolor left join colors on productcolor.ColorID = colors.ColorID;";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				ProductColorJoinColors pcjc = new ProductColorJoinColors(rs.getInt(1),
																		 rs.getInt(2),
																		 rs.getInt(3),
																		 rs.getString(4));
				list.add(pcjc);
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<ProductColorJoinColors> getByProductID(int id) {
		List<ProductColorJoinColors> list = new ArrayList<ProductColorJoinColors>();
		String sql = "SELECT PColorID, ProductID, productcolor.ColorID, ColorName FROM productcolor left join colors on productcolor.ColorID = colors.ColorID where productid = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				ProductColorJoinColors pcjc = new ProductColorJoinColors(rs.getInt(1),
																		 rs.getInt(2),
																		 rs.getInt(3),
																		 rs.getString(4));
				list.add(pcjc);
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
