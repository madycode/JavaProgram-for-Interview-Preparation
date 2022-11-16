package com.interview;

import java.util.Arrays;

public class ThirdLargestInArrayExample {
	

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Third Largest: " + getThirdLargest(a, 6));
		//System.out.println("Third Largest: " + getThirdLargest(b, 7));
	}

	private static int getThirdLargest(int[] a, int i) {
		// TODO Auto-generated method stub
		
		Arrays.sort(a);
		
		
		return i- 3;
	}
}
