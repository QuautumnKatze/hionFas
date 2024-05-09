package model;

public class HomeSlider {
	private int sliderID;
	private String name;
	private String description;
	private String link;
	private String image;
	public HomeSlider() {
		super();
	}
	public HomeSlider(int sliderID, String name, String description, String link, String image) {
		super();
		this.sliderID = sliderID;
		this.name = name;
		this.description = description;
		this.link = link;
		this.image = image;
	}
	public int getSliderID() {
		return sliderID;
	}
	public void setSliderID(int sliderID) {
		this.sliderID = sliderID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	  

}
