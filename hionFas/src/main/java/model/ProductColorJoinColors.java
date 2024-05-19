package model;

public class ProductColorJoinColors {
	private int pColorID;
	private int productID;
	private int colorID;
	private String colorName;
	public ProductColorJoinColors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductColorJoinColors(int pColorID, int productID, int colorID, String colorName) {
		super();
		this.pColorID = pColorID;
		this.productID = productID;
		this.colorID = colorID;
		this.colorName = colorName;
	}
	public int getpColorID() {
		return pColorID;
	}
	public void setpColorID(int pColorID) {
		this.pColorID = pColorID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getColorID() {
		return colorID;
	}
	public void setColorID(int colorID) {
		this.colorID = colorID;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	
}
