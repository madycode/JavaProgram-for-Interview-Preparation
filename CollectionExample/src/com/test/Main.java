package com.test;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class Main
{
	public static void main(String[] args) {
		Integer[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int splitSize = 3;
		
		/* expected Output 
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/
	
	 List<Integer> list = Arrays.asList(original);
	 // list= Arrays.asList(original);
        /* Change the value of chunkSize to get desired number of elements
        in the subLists */
        int chunkSize = 3;
        AtomicInteger counter = new AtomicInteger();
        final Collection<List<Integer>> partitionedList = 
                        list.stream().collect(Collectors.groupingBy(i -> counter.getAndIncrement() / chunkSize))
                            .values(); 
        for(List<Integer> subList : partitionedList) {
            System.out.println(subList);
        }    
	}
	
}
