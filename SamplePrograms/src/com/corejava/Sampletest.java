package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sampletest {

	public static void main(String[] args) {

		List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 1, 5, 1));
		List<Long> output = getDistanceMetrics(input);
		
		System.out.println(output);
	}

	public static List<Long> getDistanceMetrics(List<Integer> arr) {

		List<Long> output = new ArrayList<>();
		int[] array = arr.stream().mapToInt(i -> i).toArray();
		List<Integer> list;
		if (arr.size() < 0)
			return output;

		Map<Integer, List<Integer>> store = new HashMap<>();

		for (int i = 0; i < array.length; i++) {

			if (store.containsKey(array[i])) {
				list = store.get(array[i]);
				list.add(i);
				store.put(array[i], list);
			} else {
				list = new ArrayList<Integer>();
				list.add(i);
				store.put(array[i],list);
			}

		}

		System.out.println(store);
		for (int i = 0; i < array.length; i++) {

			List<Integer> list1 = store.get(array[i]);
			long sum = 0;
			for(int k:list1)
			{
				if(i!=k)
				sum = sum + (i-k);
			}
			output.add(sum);
			
		}
		return output;

	}

}
