package com.mp;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Array 
		//take a variable called max 
		//Initialize the max vaariable with 0th index 
		//iterate through for loop 
		//use if conditionmyarray[i]> max 
		//print the maximum value
		int[] myArray= {25,22,44,100,15,58};
		//               1     3      5
		int	max=myArray[0];
		int sum=0;
		
		
		System.out.println(myArray.length);
		
		
		for(int i=0;i<myArray.length;i++) {
			
			if(myArray[i]>max) {
			max=myArray[i];
			
			
			}
			
		}
		System.out.println(max);
		
		for(int i=0;i<myArray.length;i++){
			
			
			sum=sum+myArray[i];
		}
		
		System.out.println(sum);
		
		// rule is iterate through i=1 and i=i+2 for even number
		// rule is iterate through i=0 and i=i+2 for odd number 
			for(int i=1;i<myArray.length;i=i+2){
			
			
				System.out.print(myArray[i]);
		}
	}

}
