package model;

public class ProductCategories {
	private int pCategoryID;
	private String pCategoryName;
	private String identity;
	private String image;
	
	public ProductCategories() {
		super();
	}

	public ProductCategories(int pCategoryID, String pCategoryName, String identity, String image) {
		super();
		this.pCategoryID = pCategoryID;
		this.pCategoryName = pCategoryName;
		this.identity = identity;
		this.image = image;
	}

	public int getpCategoryID() {
		return pCategoryID;
	}

	public void setpCategoryID(int pCategoryID) {
		this.pCategoryID = pCategoryID;
	}

	public String getpCategoryName() {
		return pCategoryName;
	}

	public void setpCategoryName(String pCategoryName) {
		this.pCategoryName = pCategoryName;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	

	

	
	
	
	
	

}
