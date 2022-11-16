package com.exception;

public class FinallyBlock {
	   public static void main(String args[]) throws ClassNotFoundException {
	      try {
	         //System.out.println("I am in try block");
	         //System.exit(1);
	    	  int c=3/0;
	      } catch(ArithmeticException ex){
	         ex.printStackTrace();
	      } finally {
	    	  
	    	  try {
	    		  int a=1/0;
	    	  }catch(ArithmeticException ex){
	    		  ex.printStackTrace(); 
	    	  }
	    	 
	         //
	      }
	   }
	}