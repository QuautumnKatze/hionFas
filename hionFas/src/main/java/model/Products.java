package model;

public class Products {
	private int productID;
	private String productName;
	private String image;
	private ProductCategories category;
	private String shortDes;
	private String description;
	private double price;
	private String weight;
	private String material;
	private String origin;
	private String dimension;
	private boolean isActive;
	private boolean isNew;
	private boolean isBestSeller;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int productID, String productName, String image, ProductCategories category, String shortDes,
			String description, double price, String weight, String material, String origin, String dimension,
			boolean isActive, boolean isNew, boolean isBestSeller) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.image = image;
		this.category = category;
		this.shortDes = shortDes;
		this.description = description;
		this.price = price;
		this.weight = weight;
		this.material = material;
		this.origin = origin;
		this.dimension = dimension;
		this.isActive = isActive;
		this.isNew = isNew;
		this.isBestSeller = isBestSeller;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
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
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	public boolean isBestSeller() {
		return isBestSeller;
	}
	public void setBestSeller(boolean isBestSeller) {
		this.isBestSeller = isBestSeller;
	}
	
	
	
	
	
	

}
