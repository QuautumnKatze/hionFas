package model;

public class Sizes {
	private int sizeID;
	private String sizeName;
	public Sizes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sizes(int sizeID, String sizeName) {
		super();
		this.sizeID = sizeID;
		this.sizeName = sizeName;
	}
	public int getSizeID() {
		return sizeID;
	}
	public void setSizeID(int sizeID) {
		this.sizeID = sizeID;
	}
	public String getSizeName() {
		return sizeName;
	}
	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}
	
}
