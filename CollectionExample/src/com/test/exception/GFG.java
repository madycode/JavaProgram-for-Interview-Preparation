package com.test.exception;

//Java program to illustrate
//optional class methods

import java.util.Optional;

class GFG {

	// Driver code
	public static void main(String[] args)
	{

		// creating a string array
		String[] str = new String[5];

		// Setting value for 2nd index
		str[2] = "Geeks Classes are coming soon";

		// It returns an empty instance of Optional class
		//Optional<String> empty = Optional.empty();
		Optional<String> empty = Optional.ofNullable(str[6]);
		System.out.println(empty);

		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);
	}
}

