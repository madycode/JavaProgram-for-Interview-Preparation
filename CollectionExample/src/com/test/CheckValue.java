package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CheckValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List list =Arrays.asList(2,5,8,10);

Optional<Integer> element=Optional.ofNullable(2);
if(element.isPresent())
{
	System.out.println("The value is prest");
}

	}

} 
