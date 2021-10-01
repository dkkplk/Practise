
public class Sample {

	/*
	 * Input : aabbbccaa Output : b
	 * 
	 * Input : abcd Output : No consecutive chars found.
	 * 
	 * Input : aabbc Output : a
	 */
	public static void main(String[] args) {

		String input = "abbcc";

		String output = getConsicutiveMaxChar(input);

		System.out.println(output);

	}

	private static String getConsicutiveMaxChar(String input) {
		String output = "";

		char[] arr = input.toCharArray();
		int length = arr.length-1;

		int maxCount = 0;
		String maxChar = "";
		int tempCount = 1;

		for (int i = 0; i < length; i++) {

			if (arr[i] == arr[i + 1]) {

				if (maxCount < tempCount) {
					maxCount = tempCount;
					maxChar = Character.toString(arr[i]);
				}
				tempCount = tempCount + 1;

			} else {
				tempCount = 1;

			}

		}

		if (maxChar.isEmpty()) {
			output = "No consecutive chars found";
		} else {
			output = maxChar;
		}

		return output;
	}

}
