package com.mp;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test= {1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<test.length;i++) {
		//for(int j=i+1;i<test.length;i++) {
			
			if(test[i]%2==0) {
				
				System.out.print(test[i]);
			} 
			
			
		//}
	}
	
	for(int j=0;j<test.length;j++) {
		if (test[j]%2!=0) {
			System.out.print(test[j]);
		}
	}

	}

}
