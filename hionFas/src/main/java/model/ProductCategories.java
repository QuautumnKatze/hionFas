package model;

public class ProductCategories {
	private int PCategoryID;
	private String PCategoryName;
	
	public ProductCategories() {
		super();
	}

	public ProductCategories(int pCategoryID, String pCategoryName) {
		super();
		PCategoryID = pCategoryID;
		PCategoryName = pCategoryName;
	}

	public int getPCategoryID() {
		return PCategoryID;
	}

	public void setPCategoryID(int pCategoryID) {
		PCategoryID = pCategoryID;
	}

	public String getPCategoryName() {
		return PCategoryName;
	}

	public void setPCategoryName(String pCategoryName) {
		PCategoryName = pCategoryName;
	}
	
	

}
