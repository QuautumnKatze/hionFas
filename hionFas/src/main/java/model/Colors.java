package model;

public class Colors {
	private int colorID;
	private String colorName;
	public Colors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Colors(int colorID, String colorName) {
		super();
		this.colorID = colorID;
		this.colorName = colorName;
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
