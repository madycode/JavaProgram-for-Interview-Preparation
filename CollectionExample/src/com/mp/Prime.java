package com.mp;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=2;
		int temp;
		boolean isPrime=true;
		
		for(int i=2;i<n/2;i++) {
			
			temp=n%i;
			System.out.println(temp);
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("this is prime number ");
		}else {
			System.out.println("this is not prime number ");
		}

	}

}
