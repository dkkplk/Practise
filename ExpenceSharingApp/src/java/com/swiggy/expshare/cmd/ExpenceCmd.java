package java.com.swiggy.expshare.cmd;

import java.com.swiggy.expshare.model.expence.Expence;
import java.com.swiggy.expshare.model.expence.ExpenceType;
import java.com.swiggy.expshare.model.user.User;
import java.com.swiggy.expshare.model.user.UserType;
import java.util.ArrayList;
import java.util.List;

public class ExpenceCmd implements CommandType {

	@Override
	public List<String> perform(Command command, List<String> arguments) {

		User fromUser = new User("",arguments.get(1) , UserType.FromUser);
		List<User> toUsersList = new ArrayList<User>();
		int count = Integer.parseInt(arguments.get(2));
		for(int i =3; i<count ;i++)
		{
			toUsersList.add(new User(arguments.get(i),UserType.toUser));	
		}
		
		List<Double> toAmounts = new ArrayList<Double>();
		
		for(int i =count+2; i< arguments.size();i++)
		{
			toAmounts.add(arguments.get(i));	
		}
		Expence expence = new Expence(fromUser, toUsersList, arguments.get(1), arguments.get(2),arguments.get(count+1) ,toAmounts);
		
		
		
		
		return null;
	}


	

}
