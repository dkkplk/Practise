import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static int getPositionsToDestroy(List<Integer> positions) {

		List<Integer> tempList = new ArrayList<Integer>(positions);

		// Write your code here
		for (int i = 0; i < positions.size(); i++) {
			tempList.remove(i);

			if (getEvenSum(tempList) == getOddSum(tempList)) {
				return i + 1;
			}
			tempList = positions;

		}
		return -1;

	}

	private static int getEvenSum(List<Integer> list) {
		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 0) {
				sum = sum + list.get(i);
			}
		}

		return sum;
	}

	private static int getOddSum(List<Integer> list) {

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 1) {
				sum = sum + list.get(i);
			}
		}

		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(1);
		int output = getPositionsToDestroy(list);
		System.out.println(output);
	}

}
