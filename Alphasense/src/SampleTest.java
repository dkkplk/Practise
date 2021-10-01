import java.util.HashSet;
import java.util.Set;

public class SampleTest {

	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "1,a, ,1,2,3";

		int output = addAllUnique(input);

		System.out.println(output);
	}

	private static int addAllUnique(String input) {

		int sum = 0;

		if (input == null)
			return sum;

		Set<Integer> store = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c) && store.add(Character.getNumericValue(c))) {
				sum += Character.getNumericValue(c);
			}

		}
		return sum;
	}

}
