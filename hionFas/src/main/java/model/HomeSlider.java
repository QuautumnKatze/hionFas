package model;

public class HomeSlider {
	private int SliderID;
	private String Name;
	private String Description;
	private String Link;
	private String Image;
	public HomeSlider() {
		super();
	}
	public HomeSlider(int sliderID, String name, String description, String link, String image) {
		super();
		SliderID = sliderID;
		Name = name;
		Description = description;
		Link = link;
		Image = image;
	}
	public int getSliderID() {
		return SliderID;
	}
	public void setSliderID(int sliderID) {
		SliderID = sliderID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	
	  

}
