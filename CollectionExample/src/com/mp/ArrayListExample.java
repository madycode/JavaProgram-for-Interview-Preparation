package com.mp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(130);
		al.add(150);
		
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------");
		for(Object list:al) {
			
			System.out.println(list);
		}
		

	}

}
