package com.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestInStream {

	static PriorityQueue<Integer> min;
	static int k;

	public static void main(String[] args) {

		min = new PriorityQueue<>();

		k = 4;

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		List<Integer> res = getAllKthNumber(arr);

		for (int x : res)
			System.out.print(x + " ");
	}

	private static List<Integer> getAllKthNumber(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();

		for (int val : arr) {
			if (min.size() < k) {
				min.add(val);
			} else {
				if (val > min.peek()) {
					min.poll();
					min.add(val);
				}
			}

			if (min.size() >= k) {
				list.add(min.peek());
			} else {
				list.add(-1);
			}
		}
		return list;
	}

}
