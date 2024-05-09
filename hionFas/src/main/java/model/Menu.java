package model;

public class Menu {
	private int menuID;
	private String menuName;
	private int level;
	private int parentID;
	private String link;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int menuID, String menuName, int level, int parentID, String link) {
		super();
		this.menuID = menuID;
		this.menuName = menuName;
		this.level = level;
		this.parentID = parentID;
		this.link = link;
	}
	public int getMenuID() {
		return menuID;
	}
	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getParentID() {
		return parentID;
	}
	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	

}
