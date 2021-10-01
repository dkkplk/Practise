package com.corejava;

public class MaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
		int output = findMaxDiff(arr);
		System.out.println(output);
	}

	private static int findMaxDiff(int[] arr) {
		int maxDiff = arr[1] - arr[0];
		int minElement = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] - minElement > maxDiff) {
				maxDiff = arr[i] - minElement;
			}

			if (arr[i] < minElement) {
				minElement = arr[i];
			}
		}

		return maxDiff;
	}

}
