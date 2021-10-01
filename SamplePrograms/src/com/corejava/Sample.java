package com.corejava;

import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String args[]) {

		List<String> spins = new ArrayList<String>();
		spins.add("712");
		spins.add("246");
		spins.add("365");
		spins.add("312");

		int output = slotWheel(spins);

	}

	private static int slotWheel(List<String> spins) {

		int output = 0;
		int maxInRow = 0;
		
		

		for (int i = 1; i < spins.size(); i++) {

			int number = Integer.parseInt(spins.get(i));
			int largest = 0;
			while (number != 0) {
				int r = number % 10;
				largest = Math.max(largest, r);
				number = number / 10;
			}
			maxInRow = Math.max(maxInRow, largest);
			String rowValue = spins.get(i);
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < rowValue.length()-1; j++) {
				if (Integer.parseInt(String.valueOf(rowValue.charAt(i))) == largest) {
					sb.append("");
				} else {
					sb.append(rowValue.charAt(i));
				}
			}

			spins.add(i, sb.toString());

		}
		output = output + maxInRow;

		return output;
	}

}
