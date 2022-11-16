package com.mp;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Mahadev";
		int count=0;
		char[] chars=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=i+1;j<s.length();j++) {
				
				if(chars[i]==chars[j]) {
					System.out.println(chars[j]);
					
					count++;
					break;
				}
			}
		}
		

	}

}
