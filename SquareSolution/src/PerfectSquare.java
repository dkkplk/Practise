
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 4;
		for (int j = 1; j < 26; j++) {
			boolean output = isPerfectSquare(j);
			System.out.println("Number is" + j + " Square is perfect " + output);
		}
	}

	public static boolean isPerfectSquare(int input) {

		for (int i = 1; i <= input / 2; i++) {
			if (i * i == input) {
				return true;
			}

			if (i * i > input) {
				break;
			}
		}
		return false;
	}

}
