import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
	
	String votes[] = {"john", "johnny", "jackie",
            "johnny", "john", "jackie",
            "jamie", "jamie", "john",
            "johnny", "jamie", "john", "johnny"};
		
		String output = getWinner(votes);
		
		System.out.println(output);
		

	}

	private static String getWinner(String[] votes) {
		String winner = "";
		int maxValueMap = 0;
		Map<String,Integer> store = new HashMap<String, Integer>();
		
		
		for(String s:votes)
		{
			if(store.containsKey(s))
			{
				store.put(s, store.get(s)+1);
			
			}
			else
			{
				store.put(s, 1);
			}
			
			String key = s;
			Integer val = store.get(s);
			
			if(val > maxValueMap)
			{
				 maxValueMap = val;
				 winner = key;
			}
			else if(val == maxValueMap && winner.compareTo(key) > 0)
			{
				winner = "NA";
			}
			
		}
		
		
		/*
		 * for(Map.Entry<String, Integer> e: store.entrySet()) { String key =
		 * e.getKey(); Integer val = e.getValue();
		 * 
		 * if(val >maxValueMap) { maxValueMap = val; winner = key; } else if(val ==
		 * maxValueMap && winner.compareTo(key) > 0) { winner = "NA"; }
		 * 
		 * 
		 * }
		 */	
		return winner;
	}

	

}
