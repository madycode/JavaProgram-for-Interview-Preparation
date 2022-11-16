package com.test;

//Java Program to Illustrate peek() Method
//of Stream class Without Terminal Operation Count

//Importing required classes
import java.util.*;

//Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating a list of Integers
		List<Integer> list
			= Arrays.asList(0, 2, 4, 6, 8, 10);

		// Using peek without any terminal
		// operation does nothing
		list.stream().peek(System.out::println).count();
	}
}
