package java.com.swiggy.expshare.model.expence;

import java.com.swiggy.expshare.model.user.User;
import java.util.List;

public interface ExpenceType {

	public void expence(User fromUser,double fromAmount, int UserCount, List<User> toUsersList);

}
