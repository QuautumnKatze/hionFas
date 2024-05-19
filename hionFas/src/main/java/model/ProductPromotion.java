package model;

public class ProductPromotion {
	private int promotionID;
	private int productID;
	private int saleOFF;
	private String description;
	public ProductPromotion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductPromotion(int promotionID, int productID, int saleOFF, String description) {
		super();
		this.promotionID = promotionID;
		this.productID = productID;
		this.saleOFF = saleOFF;
		this.description = description;
	}
	public int getPromotionID() {
		return promotionID;
	}
	public void setPromotionID(int promotionID) {
		this.promotionID = promotionID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getSaleOFF() {
		return saleOFF;
	}
	public void setSaleOFF(int saleOFF) {
		this.saleOFF = saleOFF;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
