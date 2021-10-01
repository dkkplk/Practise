package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumNumbersIntref s = (a, b) -> a + b;

		int output = s.sum(3, 4);
		System.out.println(output);
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,5,6,3,8,4,2,1,8));
		
		List<Integer> output1 = list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(output1);
		
	}

}

interface SumNumbersIntref {
	int sum(int a, int b);
}
