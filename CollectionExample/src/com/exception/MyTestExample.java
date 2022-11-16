package com.exception;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] test= {2,4,6,10,10};
		
		List<Integer> list=Arrays.asList(test);
		//int temp=0;
		/*for(int i=0;i<test.length;i++) {
			
			for(int k=i + 1;k<test.length;k++) {
				if(test[i]==test[k]) {
					System.out.println("uuu"+test[i] );
				}
			}
			
		}*/
			
			//System.out.println(value);
			
			
		list.stream()
        .filter(i -> Collections.frequency(list, i) > 1)
        //Collect elements to a Set and print out the values 
        .collect(Collectors.toSet())
        .forEach(System.out::println);
		
		
		
		String s="Mahadev";
	int	k=s.length()-1;
		
	System.out.print(k+"iiiiiii");
		for(int i=s.length()-1;i>0;i--) {
			
			System.out.print(s.charAt(i));
		}
		

	}

}
