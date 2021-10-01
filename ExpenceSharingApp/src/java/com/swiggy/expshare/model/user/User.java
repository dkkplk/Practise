package java.com.swiggy.expshare.model.user;

import java.util.List;

public class User {

	private String userId;
	private String userName;
	private String email;
	private String mobileNumber;
	private UserType userType;
	

	public User(String userId, String userName, String email, String mobileNumber, UserType userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.userType = userType;
	}

	public User(String userName, UserType userType) {
		super();
		this.userId = "test";
		this.userName = userName;
		this.userType = userType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}
