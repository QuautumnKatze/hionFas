package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.ProductCategories;
import model.Products;

public class ProductsDAO extends DBContext {
	
	public List<Products> getProductByCategoryId(int PCategoryID) {
		List<Products> list = new ArrayList<Products>();
		ProductCategoriesDAO cd = new ProductCategoriesDAO();
		String sql = "SELECT products.ProductID, products.ProductName, products.Image, products.PCategoryID, products.ShortDes, products.Description, products.price from Products where 1=1 ";
		
		if (PCategoryID!=0) {
			sql = sql + " and products.PCategoryID = " + PCategoryID;
		}
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			String ProductName, Image, ShortDes, Description;
			int ProductID;
			double Price;
			
			while (rs.next()) {
				ProductID = rs.getInt(1);
				ProductName = rs.getString(2);
				Image = rs.getString(3);
				PCategoryID = rs.getInt(4);
				ShortDes = rs.getString(5);
				Description = rs.getString(6);
				Price = rs.getDouble(7);
				
				ProductCategories c = cd.getProductCategoriesById(PCategoryID);
				Products p = new Products(ProductID, ProductName, Image, c, ShortDes, Description, Price);
				list.add(p);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
		
	}
}
