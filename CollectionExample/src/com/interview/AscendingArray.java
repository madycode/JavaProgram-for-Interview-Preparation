package com.interview;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		
		int[] myArray= {25,22,44,100,15,58};
		
		for(int i=0;i<myArray.length;i++) {
			for(int j=i+1;j<myArray.length;j++) {
				
				if(myArray[i]<myArray[j]) {
					
					temp=myArray[i];
					myArray[i]=myArray[j];
					myArray[j]=temp;
					
				}
			}
			
			
		}
		
		for(int i=0;i<myArray.length;i++) {
			System.out.print(myArray[i]+"------------------------------");
		}
		System.out.println();
	}

}
