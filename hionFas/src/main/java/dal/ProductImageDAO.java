package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ProductImage;
import model.Products;

public class ProductImageDAO extends DBContext {
	
	public List<ProductImage> getByProductID(int productID) {
		List<ProductImage> list = new ArrayList<ProductImage>();
		ProductsDAO pd = new ProductsDAO();
		String sql = "SELECT * FROM hionfasdb.productimage where ProductID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, productID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Products p = pd.getProductById(productID);
				ProductImage pi = new ProductImage(rs.getInt(1),
												   p,
												   rs.getString(3));
				list.add(pi);
			}
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public void insert(ProductImage pi) {
		String sql = "INSERT INTO `hionfasdb`.`productimage` (`ProductID`, `Image`) VALUES (?, ?)";
				
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, pi.getProduct().getProductID());
			ps.setString(2, pi.getImage());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void update(ProductImage pi) {
		String sql = "UPDATE `hionfasdb`.`productimage` SET `ProductID` = ?, `Image` = ? WHERE (`ProductImageID` = ?)";
				
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, pi.getProduct().getProductID());
			ps.setString(2, pi.getImage());
			ps.setInt(3, pi.getProduct().getProductID());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM `hionfasdb`.`productimage` WHERE (`ProductImageID` = ?);";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
