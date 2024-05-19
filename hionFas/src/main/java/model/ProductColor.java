package model;

public class ProductColor {
	private int pColorID;
	private int productID;
	private int colorID;
	public ProductColor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductColor(int pColorID, int productID, int colorID) {
		super();
		this.pColorID = pColorID;
		this.productID = productID;
		this.colorID = colorID;
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
	
}
