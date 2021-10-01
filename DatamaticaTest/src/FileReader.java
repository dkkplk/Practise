import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReader {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\dkumar\\Practise\\DatamaticaTest\\src\\sample.txt";
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Content of List:");
		System.out.println(lines);
		
		Map<String,Integer> store = new HashMap<>();
		
		
		for(String s: lines)
		{
			if(store.containsKey(s))
			{
				store.put(s, store.get(s)+1);
			}
			else
			{
				store.put(s, 1);
			}
		}
		
		System.out.println(store);
	}

}
