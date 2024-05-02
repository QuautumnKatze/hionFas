package model;

public class Products {
	private int ProductID;
	private String ProductName;
	private String Image;
	private ProductCategories category;
	private String ShortDes;
	private String Description;
	private double price;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Products(int productID, String productName, String image, ProductCategories category, String shortDes,
			String description, double price) {
		super();
		ProductID = productID;
		ProductName = productName;
		Image = image;
		this.category = category;
		ShortDes = shortDes;
		Description = description;
		this.price = price;
	}

	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public ProductCategories getCategory() {
		return category;
	}
	public void setCategory(ProductCategories category) {
		this.category = category;
	}
	public String getShortDes() {
		return ShortDes;
	}
	public void setShortDes(String shortDes) {
		ShortDes = shortDes;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}
