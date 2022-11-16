package com.mp;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=371;
		int a=0,b=0,c=0;
		int temp=n;
		
		while(n>0) {
			
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
			System.out.println("Amstrong Number isss"+c);	
			
			
		}
		if(temp==c) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not Amstrong Number");
		}

	}

}
