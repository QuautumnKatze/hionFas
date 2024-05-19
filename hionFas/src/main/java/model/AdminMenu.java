package model;

public class AdminMenu {
	private int menuID;
	private String menuName;
	private int level;
	private int parentID;
	private String icon;
	private String link;
	public AdminMenu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminMenu(int menuID, String menuName, int level, int parentID, String icon, String link) {
		super();
		this.menuID = menuID;
		this.menuName = menuName;
		this.level = level;
		this.parentID = parentID;
		this.icon = icon;
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
}
