package com.mp;

public class Fiboo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 01=1,011
		//011=2
		//0112=3
		//01123=5
		
		int a=0,b=0,c=1;
		int temp;
		int n=5;
		for(int i=0;i<n;i++) {
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a);
		}

	}

}
