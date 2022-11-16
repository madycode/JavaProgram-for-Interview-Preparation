package com.exception;

//Java program for the above approach
class Gfg{

//Function to check if B is a
//prefix of A or not
static void checkprefix(int A, int B)
{

	// Convert numbers into Strings
	String s1 = String.valueOf(A);
	String s2 = String.valueOf(B);

	boolean result;

	// Check if s2 is a prefix of s1
	// or not using starts_with() function
	result = s1.startsWith(s2);

	// If result is true, print "Yes"
	if (result)
	{
		System.out.print("Yes");
	}
	else
	{
		System.out.print("No");
	}
}

//Driver Code
public static void main(String[] args)
{
	
	// Given numbers
	int A = 12345, B = 12;

	// Function call
	checkprefix(A, B);
}
}

//This code is contributed by amal kumar choubey
