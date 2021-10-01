package com.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmailVlidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> emails = new ArrayList<>();

		emails.add("jkl@example.com");
		emails.add("xyz@example.com");
		emails.add("xxx");
		emails.add("abc@example.com");

		List<String> validemails = getValidEmails(emails);

		System.out.println(validemails);

	}

	private static List<String> getValidEmails(List<String> emails) {
		// TODO Auto-generated method stub
		return emails.stream()
				.filter(s -> s.contains("@"))
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}

}
