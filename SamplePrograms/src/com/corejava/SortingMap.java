package com.corejava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Double> data = new LinkedHashMap<>();
		data.put(1, new Double(0.7));
		data.put(2, new Double(0.5));
		data.put(3, new Double(0.3));

		data = data.entrySet()
				.stream()
				.filter( e -> e.getValue().doubleValue() >= 0.5)
				.sorted(Map.Entry.comparingByValue())
				//.limit(1)
				.collect(Collectors.toMap(Map.Entry::getKey,
						Map.Entry::getValue));
		
		System.out.println(data);
	}

}
