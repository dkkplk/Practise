package com.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestJava8Streams {

	public static void main(String args[]) {

		Map<String, List<String>> ordersMap = new HashMap<>();

		List<String> items = new ArrayList<String>();
		items.add("Item1");
		ordersMap.put("order1", items);
		List<String> items1 = new ArrayList<String>();
		items1.add("Item7");
		items1.add("Item3");
		ordersMap.put("order2", items1);
		List<String> items2 = new ArrayList<String>();
		items2.add("Item4");
		items2.add("Item2");
		items2.add("Item7");
		ordersMap.put("order3", items2);

		ordersMap.entrySet()
		.stream()
		.map(e -> e.getValue())
		.flatMap(List::stream)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue())
		.ifPresent(System.out::println);

	}

}
