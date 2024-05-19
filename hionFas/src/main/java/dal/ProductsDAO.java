package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ProductCategories;
import model.Products;

public class ProductsDAO extends DBContext {
	
	public List<Products> getAll() {
		List<Products> list = new ArrayList<Products>();
		ProductCategoriesDAO cd = new ProductCategoriesDAO();
		String sql = "SELECT * from Products";
		
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			String ProductName, Image, ShortDes, Description, Weight, Material, Origin, Dimension;
			int ProductID, PCategoryID;
			boolean isActive, isNew, isBestSeller;
			double Price;
			
			while (rs.next()) {
				ProductID = rs.getInt(1);
				ProductName = rs.getString(2);
				Image = rs.getString(3);
				PCategoryID = rs.getInt(4);
				ShortDes = rs.getString(5);
				Description = rs.getString(6);
				Price = rs.getDouble(7);
				Weight = rs.getString(8);
				Material = rs.getString(9);
				Origin = rs.getString(10);
				Dimension = rs.getString(11);
				isActive = rs.getBoolean(12);
				isNew = rs.getBoolean(13);
				isBestSeller = rs.getBoolean(14);
						
				
				ProductCategories c = cd.getProductCategoriesById(PCategoryID);
				Products p = new Products(ProductID, ProductName, Image, c, ShortDes, Description, Price, Weight, Material, Origin, Dimension, isActive, isNew, isBestSeller);
				list.add(p);
			}
			st.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public List<Products> get16Products() {
		List<Products> list = new ArrayList<Products>();
		ProductCategoriesDAO cd = new ProductCategoriesDAO();
		String sql = "SELECT * from Products order by ProductID desc limit 16";
		
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			String ProductName, Image, ShortDes, Description, Weight, Material, Origin, Dimension;
			int ProductID, PCategoryID;
			boolean isActive, isNew, isBestSeller;
			double Price;
			
			while (rs.next()) {
				ProductID = rs.getInt(1);
				ProductName = rs.getString(2);
				Image = rs.getString(3);
				PCategoryID = rs.getInt(4);
				ShortDes = rs.getString(5);
				Description = rs.getString(6);
				Price = rs.getDouble(7);
				Weight = rs.getString(8);
				Material = rs.getString(9);
				Origin = rs.getString(10);
				Dimension = rs.getString(11);
				isActive = rs.getBoolean(12);
				isNew = rs.getBoolean(13);
				isBestSeller = rs.getBoolean(14);
						
				
				ProductCategories c = cd.getProductCategoriesById(PCategoryID);
				Products p = new Products(ProductID, ProductName, Image, c, ShortDes, Description, Price, Weight, Material, Origin, Dimension, isActive, isNew, isBestSeller);
				list.add(p);
			}
			st.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
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
			
			String ProductName, Image, ShortDes, Description, Weight, Material, Origin, Dimension;
			int ProductID;
			double Price;
			boolean isActive, isNew, isBestSeller;
			
			while (rs.next()) {
				ProductID = rs.getInt(1);
				ProductName = rs.getString(2);
				Image = rs.getString(3);
				PCategoryID = rs.getInt(4);
				ShortDes = rs.getString(5);
				Description = rs.getString(6);
				Price = rs.getDouble(7);
				Weight = rs.getString(8);
				Material = rs.getString(9);
				Origin = rs.getString(10);
				Dimension = rs.getString(11);
				isActive = rs.getBoolean(12);
				isNew = rs.getBoolean(13);
				isBestSeller = rs.getBoolean(14);

				
				ProductCategories c = cd.getProductCategoriesById(PCategoryID);
				Products p = new Products(ProductID, ProductName, Image, c, ShortDes, Description, Price, Weight, Material, Origin, Dimension, isActive, isNew, isBestSeller);
				list.add(p);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
		
	}
	
	public Products getProductById(int productID) {
		ProductCategoriesDAO cd = new ProductCategoriesDAO();
		String sql = "SELECT * from Products where ProductID = ? ";
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, productID);
			ResultSet rs = ps.executeQuery();
			
			
			if (rs.next()) {
				String ProductName, Image, ShortDes, Description, Weight, Material, Origin, Dimension;
				int ProductID, PCategoryID;
				double Price;
				boolean isActive, isNew, isBestSeller;
				ProductID = rs.getInt(1);
				ProductName = rs.getString(2);
				Image = rs.getString(3);
				PCategoryID = rs.getInt(4);
				ShortDes = rs.getString(5);
				Description = rs.getString(6);
				Price = rs.getDouble(7);
				Weight = rs.getString(8);
				Material = rs.getString(9);
				Origin = rs.getString(10);
				Dimension = rs.getString(11);
				isActive = rs.getBoolean(12);
				isNew = rs.getBoolean(13);
				isBestSeller = rs.getBoolean(14);
				
				ProductCategories c = cd.getProductCategoriesById(PCategoryID);
				Products p = new Products(ProductID, ProductName, Image, c, ShortDes, Description, Price, Weight, Material, Origin, Dimension, isActive, isNew, isBestSeller);
				return p;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public void insert(Products p) {
		String sql = "INSERT INTO `hionfasdb`.`products` (`ProductName`, `Image`, `PCategoryID`, `ShortDes`, `Description`, `price`, `Weight`, `Material`, `Origin`, `Dimension`, `IsActive`, `IsNew`, `IsBestSeller`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, p.getProductName());
			ps.setString(2, p.getImage());
			ps.setInt(3, p.getCategory().getpCategoryID());
			ps.setString(4, p.getShortDes());
			ps.setString(5, p.getDescription());
			ps.setDouble(6, p.getPrice());
			ps.setString(7, p.getWeight());
			ps.setString(8, p.getMaterial());
			ps.setString(9, p.getOrigin());
			ps.setString(10, p.getDimension());
			ps.setBoolean(11, p.isActive());
			ps.setBoolean(12, p.isNew());
			ps.setBoolean(13, p.isBestSeller());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void update(Products p) {
		String sql = "UPDATE `hionfasdb`.`products` SET `ProductName` = ?, `Image` = ?, `PCategoryID` = ?, `ShortDes` = ?, `Description` = ?, `price` = ?, `Weight` = ?, `Material` = ?, `Origin` = ?, `Dimension` = ?, `IsActive` = ?, `IsNew` = ?, `IsBestSeller` = ? WHERE `ProductID` = ?";
			
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, p.getProductName());
			ps.setString(2, p.getImage());
			ps.setInt(3, p.getCategory().getpCategoryID());
			ps.setString(4, p.getShortDes());
			ps.setString(5, p.getDescription());
			ps.setDouble(6, p.getPrice());
			ps.setString(7, p.getWeight());
			ps.setString(8, p.getMaterial());
			ps.setString(9, p.getOrigin());
			ps.setString(10, p.getDimension());
			ps.setBoolean(11, p.isActive());
			ps.setBoolean(12, p.isNew());
			ps.setBoolean(13, p.isBestSeller());
			ps.setInt(14, p.getProductID());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM `hionfasdb`.`products` WHERE (`ProductID` = ?);";
		
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
