package model;

public class ProductImage {
	private int productImageID;
	private Products product;
	private String image;
	public ProductImage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductImage(int productImageID, Products product, String image) {
		super();
		this.productImageID = productImageID;
		this.product = product;
		this.image = image;
	}
	public int getProductImageID() {
		return productImageID;
	}
	public void setProductImageID(int productImageID) {
		this.productImageID = productImageID;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
