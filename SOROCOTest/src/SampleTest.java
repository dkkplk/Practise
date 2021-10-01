public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "hello";
		String output = removeDuplicate(input);
		System.out.println(output);
	}

	private static String removeDuplicate(String input) {
		StringBuilder sb = new StringBuilder();

		int store1[] = new int[26];

		for (int i = 0; i < input.length(); i++) {

			int index = input.charAt(i) - 'a';

			if (store1[index] == 1) {
				continue;
			} else {

				store1[index] = 1;
				sb.append(input.charAt(i));

			}
		}

		return sb.toString();
	}

}
