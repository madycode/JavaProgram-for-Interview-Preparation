package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[]args) {
		
		List<String> strList = Arrays.asList("abc", "123", "bcd", "", "defg", "jk"); 
		long count = strList.stream() .filter(x -> x.startsWith("1")).count();
		
		long num = strList.stream() .filter(x -> x.length()> 3) .count();

		System.out.println(count);
		
		System.out.println(num);
		
		List<String> filtered = strList.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList());

		System.out.println(filtered);
		
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", "));
		
		System.out.println(G7Countries);
		
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		List<Integer> distinct = numbers.stream() .map( i -> i*i).distinct() .collect(Collectors.toList()); 
		System.out.printf("Original List : %s, Square Without duplicates : %s %n", numbers, distinct);
	
	
	}
}
