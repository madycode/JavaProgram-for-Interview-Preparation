	package com.test;

public class ProgramException {
	
	public static void main(String [] args) {
		
		int b=5; int c=0;
		try {
			int a=b/c;
		}catch(ArithmeticException ex) {
			
			System.out.println(ex);
			
			System.exit(0);
			
		}finally {
			System.out.println("=======after the exception");
			

			
			
		
			
		}
		
	}

}
