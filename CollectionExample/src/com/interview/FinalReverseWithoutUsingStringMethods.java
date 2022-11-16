package com.interview;

public class FinalReverseWithoutUsingStringMethods {
	
	public static void main(String[] args) {
		
		String s="mahadev";
		
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		sb.reverse();
		
		System.out.println(sb);
	}

}
