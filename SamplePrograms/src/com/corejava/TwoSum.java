package com.corejava;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 14;
		int[] input = {5,2,4,8,1,9};
		int[] output = findIndexes(input,sum);
		System.out.println(output[0] + " "+output[1]);
	}

	private static int[] findIndexes(int[] input, int sum) {
		int[] output = {-1,-1};
		Map<Integer,Integer> store = new HashMap<>();
		
		if(input == null)
		{
			return output;
		}
		
		for(int i = 0 ;i<input.length;i++)
		{
			int diff = sum - input[i];
						
			if(store.containsKey(input[i]))
			{
				output[0] = store.get(input[i]);
				output[1] = i;
				return output;
			}
			else
			{
				store.put(diff, i);
			}
			
		}
		
		
		return output;
	}

}
