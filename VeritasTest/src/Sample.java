public class Sample {

	public static void main(String[] args) {

		int input = 5;

		boolean isPrime = isPrimeNumber(input);

		System.out.println(isPrime);

	}

	private static boolean isPrimeNumber(int input) {

		boolean isPrime = true;

		if (input < 0) {
			isPrime = false;
		}
		
		int sqrRoot = (int) Math.sqrt(input);

		for(int i = 2; i < sqrRoot; i++) {

			if (input % i == 0) {
				isPrime = false;
			}

		}
		return isPrime;
	}

}
