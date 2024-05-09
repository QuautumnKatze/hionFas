package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.ProductCategories;

public class ProductCategoriesDAO extends DBContext {
	
	public List<ProductCategories> getAll() {
		List<ProductCategories> list = new ArrayList<ProductCategories>();
		String sql = "select * from productcategories";
		
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				ProductCategories c = new ProductCategories(rs.getInt(1),
															rs.getString(2),
															rs.getString(3),
															rs.getString(4));
				list.add(c);
			}
			st.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public ProductCategories getProductCategoriesById(int id) {
		String sql = "select * from productcategories where PCategoryID = ?";
		
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				ProductCategories c = new ProductCategories(rs.getInt(1),
															rs.getString(2),
															rs.getString(3),
															rs.getString(4));
				return c;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	public List<ProductCategories> getProductCategoriesLimit3() {
		List<ProductCategories> listLimit3 = new ArrayList<ProductCategories>();
		String sql = "SELECT  * FROM hionfasdb.productcategories order by PCategoryID asc limit 3";
		
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				ProductCategories c = new ProductCategories(rs.getInt(1),
															rs.getString(2),
															rs.getString(3),
															rs.getString(4));
				listLimit3.add(c);
			}
			st.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return listLimit3;
	}

}
