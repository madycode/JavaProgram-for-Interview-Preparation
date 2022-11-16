package com.test.thread;

import java.util.ArrayList;

//Java program to show
//ConcurrentModificationException

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class ModificationError {
	public static void main(String args[])
	{

		// Creating an object of ArrayList Object
		List<String> arr
			= new ArrayList<String>();
		
	//	List<String> arr
		//= new CopyOnWriteArrayList<String>();

		arr.add("One");
		arr.add("Two");
		arr.add("Three");
		arr.add("Four");
		
		List<String> first2Names = arr.subList(0, 2);

		System.out.println(arr + " -----------, " + first2Names);

		try {
			// Printing the elements
			System.out.println(
				"ArrayList: ");
			ListIterator<String> iter
				= arr.listIterator();

			while (iter.hasNext()) {

				System.out.print(iter.next()
								+ ", ");

				// ConcurrentModificationException
				// is raised here as an element
				// is added during the iteration
				System.out.println(
					"\n\nTrying to add"
					+ " an element in "
					+ "between iteration\n");
				//arr.add("Five");
				
				iter.set("Five");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

