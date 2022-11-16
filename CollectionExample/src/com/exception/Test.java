package com.exception;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = new Integer[]{123, 222, 5321,167,298};

		int searchString = 1;

		boolean doesContain = Arrays.stream(arr)
		        .anyMatch(x -> x.equals(searchString));

		System.out.println(doesContain);

	}

}
