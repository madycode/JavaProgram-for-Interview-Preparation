package com.exception;

public class CustomException {
	
	public void getException(String item) throws ItemNotFoundException {
		
		if(item!=null) {
			
			throw new ItemNotFoundException("Item is available");
		}else {
			
			System.out.println("Item is not there");
		}
		
	}

	public static void main(String[] args) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		CustomException ce=new CustomException();
		ce.getException("apple");

	}

}
