package java.com.swiggy.expshare.store;

import java.com.swiggy.expshare.model.user.Owes;
import java.com.swiggy.expshare.model.user.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
	
	Map<User,List<Owes>> mapStore = new HashMap<>();

	
	public List<Owes> showAll()
	{
		List<Owes> list = mapStore
				.entrySet()
				.stream()
				.map(l -> l.getValue())
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		return list;
	}
	
	
	public List<Owes> showOwesForuser(User user)
	{
		List<Owes> list = mapStore
				.entrySet()
				.stream()
				.filter(e -> {
				if(e.getKey().equals(user))
				{
					
				}
				} )
				.collect(Collectors.toList());
		
		return list;
	}
	
}
