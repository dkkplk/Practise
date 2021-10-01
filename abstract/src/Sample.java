
public class Sample {

	public static void main(String[] args) {

		String input = "1234";
		int evenSubstringCount = getEvenSubstringCount(input);
		System.out.println(evenSubstringCount);
	}

	private static int getEvenSubstringCount(String input) {

		int count = 0;

		if (input == null) {
			return count;
		}
		int size = input.length();

		  for (int i = 0; i < size; i++)
	        {
	            int temp = input.charAt(i) - '0';
	     
	            // If current digit is even, add
	            // count of substrings ending with
	            // it. The count is (i+1)
	            if (temp % 2 == 0)
	                count += (i + 1);
	        }
		return count;
	}

}
