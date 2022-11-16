package com.test;



public class TestStatic {
static {
  //static block
  System.out.println("Hi, I'm a Static Block!");
  }
{
	System.out.println("Hi, I'm a Instance  Block!");
}
public TestStatic() {
	  System.out.println("Constructor 1 Says Hi!");
	  }
	  public TestStatic(int c) {
	   System.out.println("Constructor 2 Says Hi!");
	  }
	  
	  
	  public static void main(String[] args) {
			/*
			 * int counter = 15; TestStatic object1 = new TestStatic(); TestStatic object2 =
			 * new TestStatic(); TestStatic object3 = new TestStatic(); TestStatic object4 =
			 * new TestStatic(); TestStatic object5 = new TestStatic(15);
			 */
		  TestStatic object1 = new TestStatic();
		  
		  System.out.println("im in main method");
		}
}