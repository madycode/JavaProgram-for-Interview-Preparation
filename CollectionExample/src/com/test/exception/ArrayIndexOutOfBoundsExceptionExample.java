package com.test.exception;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String[] arr = new String[10]; 
        int count=0;
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]+"--"+count++);
        }
       // System.out.println(arr[9]);
    }
}
