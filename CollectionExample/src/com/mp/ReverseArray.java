package com.mp;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array= {8,3,1,0,5,9,5,0,6,8};
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
		
		System.out.print("-------------------------");
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
	}

}
