package java.com.swiggy.expshare.model.expence;

import java.com.swiggy.expshare.model.user.User;
import java.util.List;

public class Expence {

	private User fromUser;
	private List<User> toUsersList;
	private double fromAmount;
	private int UserCount;
	private ExpenceType expenceType;
	private List<Double> toAmounts;

	public Expence(User fromUser, List<User> toUsersList, double fromAmount, int userCount, ExpenceType expenceType,
			List<Double> toAmounts) {
		super();
		this.fromUser = fromUser;
		this.toUsersList = toUsersList;
		this.fromAmount = fromAmount;
		UserCount = userCount;
		this.expenceType = expenceType;
		this.toAmounts = toAmounts;
	}

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public List<User> getToUsersList() {
		return toUsersList;
	}

	public void setToUsersList(List<User> toUsersList) {
		this.toUsersList = toUsersList;
	}

	public double getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(double fromAmount) {
		this.fromAmount = fromAmount;
	}

	public int getUserCount() {
		return UserCount;
	}

	public void setUserCount(int userCount) {
		UserCount = userCount;
	}

	public ExpenceType getExpenceType() {
		return expenceType;
	}

	public void setExpenceType(ExpenceType expenceType) {
		this.expenceType = expenceType;
	}

	public List<Double> getToAmounts() {
		return toAmounts;
	}

	public void setToAmounts(List<Double> toAmounts) {
		this.toAmounts = toAmounts;
	}

}
