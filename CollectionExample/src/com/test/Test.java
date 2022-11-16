package com.test;

//A Java program to demonstrate
//multicatch feature

import java.util.Scanner;

public class Test
{
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		try
		{
			int n = Integer.parseInt(scn.nextLine());
			if (99%n == 0)
				System.out.println(n + " is a factor of 99");
			int a=1/0;
		}
		catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex)
		{
			System.out.println("Exception encountered " + ex);
		}
	}
}
