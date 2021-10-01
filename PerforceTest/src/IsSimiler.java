import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IsSimiler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list1 = new ArrayList<>();
		list1.add("amage");
		list1.add("good");
		list1.add("best");
		List<String> list2 = new ArrayList<String>();
		list2.add("mac");
		list2.add("sac");
		list2.add("lac");
		List<List<String>> list3 = new ArrayList<>();
		
		list3.add(Arrays.asList("amage","mac"));
		list3.add(Arrays.asList("mac","jac"));
		list3.add(Arrays.asList("good","sac"));
		list3.add(Arrays.asList("best","lac"));
		
		Map<String,String> store = new HashMap<>();
		Set<String> secondListSet = new HashSet<>();
		boolean isSimiler = false;
		
		for(List<String> l : list3)
		{
			store.put(l.get(0),l.get(1));
		}
		
		for(String s: list2)
		{
			secondListSet.add(s);
		}
		
		
		boolean temp = false;
		for(String s: list1)
		{
			
			String valueToMatch = store.get(s);
			if(secondListSet.contains(valueToMatch))
			{
				temp = true;
				isSimiler = temp && true;
				continue;
			}
			
			while(store.containsKey(valueToMatch))
			{
				valueToMatch = store.get(valueToMatch);
				
				if(secondListSet.contains(valueToMatch))
				{
					temp = true;
				}
			}
			
			isSimiler = temp && true;
		}
		
		
		System.out.println(isSimiler);
	}

}
