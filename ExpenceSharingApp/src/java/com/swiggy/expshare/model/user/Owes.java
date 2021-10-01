package java.com.swiggy.expshare.model.user;

public class Owes {

	private User fromUser;
	private User toUser;
	private double amount;

	public Owes(User fromUser, User toUser, double amount) {
		super();
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.amount = amount;
	}

	public User getFromUser() {
		return fromUser;
	}

	public void setFromUser(User fromUser) {
		this.fromUser = fromUser;
	}

	public User getToUser() {
		return toUser;
	}

	public void setToUser(User toUser) {
		this.toUser = toUser;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
