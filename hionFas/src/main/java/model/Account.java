package model;

import java.util.Date;

public class Account {
	private int accountID;
	private String userName;
	private String passWord;
	private String fullName;
	private Date doB;
	private String address;
	private String profilePic;
	private int role;
	public Account() {
	}
	public Account(int accountID, String userName, String passWord, String fullName, Date doB, String address,
			String profilePic, int role) {
		super();
		this.accountID = accountID;
		this.userName = userName;
		this.passWord = passWord;
		this.fullName = fullName;
		this.doB = doB;
		this.address = address;
		this.profilePic = profilePic;
		this.role = role;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDoB() {
		return doB;
	}
	public void setDoB(Date doB) {
		this.doB = doB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [accountID=" + accountID + ", userName=" + userName + ", passWord=" + passWord + ", fullName="
				+ fullName + ", doB=" + doB + ", address=" + address + ", profilePic=" + profilePic + ", role=" + role
				+ "]";
	}
}
