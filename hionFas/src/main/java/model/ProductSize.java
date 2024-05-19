package model;

public class ProductSize {
	private int pSizeID;
	private int productID;
	private int sizeID;
	public ProductSize() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductSize(int pSizeID, int productID, int sizeID) {
		super();
		this.pSizeID = pSizeID;
		this.productID = productID;
		this.sizeID = sizeID;
	}
	public int getpSizeID() {
		return pSizeID;
	}
	public void setpSizeID(int pSizeID) {
		this.pSizeID = pSizeID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getSizeID() {
		return sizeID;
	}
	public void setSizeID(int sizeID) {
		this.sizeID = sizeID;
	}
	
}
