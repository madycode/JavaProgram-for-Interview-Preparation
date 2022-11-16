package com.test.thread;

public class TestThread {

	//int a=100;
	
	void printTable(int n){    
		   synchronized(this){//synchronized block    
		     for(int i=1;i<=5;i++){    
		      System.out.println(n*i);    
		      try{    
		       Thread.sleep(400);    
		      }catch(Exception e){System.out.println(e);}    
		     }    
		   }    
		 }//end of the method    
	
	 static
	    {
	        // Print statement
	        System.out.println(
	            "Static block can be printed without main method");
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThread th=new TestThread();
		th.printTable(3);
	}

}
