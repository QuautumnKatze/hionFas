package model;

public class Products {
	private int productId;
	private String productName;
	private String image;
	private ProductCategories category;
	private String shortDes;
	private String description;
	private double price;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int productId, String productName, String image, ProductCategories category, String shortDes,
			String description, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.image = image;
		this.category = category;
		this.shortDes = shortDes;
		this.description = description;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public ProductCategories getCategory() {
		return category;
	}
	public void setCategory(ProductCategories category) {
		this.category = category;
	}
	public String getShortDes() {
		return shortDes;
	}
	public void setShortDes(String shortDes) {
		this.shortDes = shortDes;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	

}
