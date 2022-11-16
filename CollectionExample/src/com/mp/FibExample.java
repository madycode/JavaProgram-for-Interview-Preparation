package com.mp;

public class FibExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c;
		
		int num=5;
		
		//5-----0 1 =1
		//0 1 1 = 2
		//0 1 1 2=3
		
		for(int i=2;i<num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
