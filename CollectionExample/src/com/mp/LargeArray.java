package com.mp;

public class LargeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="engineer";
		String temp = "";
		 for (int i = 0; i < s.length(); i++) {
			 
		      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
		        System.out.println("First non-repeating character is "+ s.charAt(i));
		        break;
		      }
		    }

		 
	

	    
		}
		
		
		
	}

	


