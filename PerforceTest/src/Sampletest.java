import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sampletest {

	public static void main(String[] args) {
		
		String parshedString = "Dhanesh,Ganesh,123,asdf";
		 List<String> recentlyUsedKeys = Stream.of(parshedString.split(","))
		           .collect(Collectors.toList());
		 
		 System.out.println(recentlyUsedKeys);
	}

}
