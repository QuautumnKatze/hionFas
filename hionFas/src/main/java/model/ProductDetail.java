package model;

public class ProductDetail {
	private int pDetailID;
	private int productID;
	private String weight;
	private String material;
	private String origin;
	private String dimension;
	public ProductDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDetail(int pDetailID, int productID, String weight, String material, String origin,
			String dimension) {
		super();
		this.pDetailID = pDetailID;
		this.productID = productID;
		this.weight = weight;
		this.material = material;
		this.origin = origin;
		this.dimension = dimension;
	}
	public int getpDetailID() {
		return pDetailID;
	}
	public void setpDetailID(int pDetailID) {
		this.pDetailID = pDetailID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
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
	
}
