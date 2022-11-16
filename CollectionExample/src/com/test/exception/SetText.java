package com.test.exception;

//A Class that represents use-defined exception

class MyException1 extends Exception {
	
}

//A Class that uses above MyException
public class SetText {
	// Driver Program
	public static void main(String args[])
	{
		try {
			// Throw an object of user defined exception
			throw new MyException1();
		}
		catch (MyException1 ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}

