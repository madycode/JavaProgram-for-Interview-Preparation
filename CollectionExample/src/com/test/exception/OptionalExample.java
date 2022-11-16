package com.test.exception;

import java.util.Optional;

public class OptionalExample {  
    public static void main(String[] args) {  
        String[] str = new String[10];  
        str[5]="Mahadev";
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        
        
        
        if(checkNull.isPresent()) {
        	 String lowercaseString = str[5].toLowerCase();  
             System.out.print(lowercaseString);
        }else {
        	
        	  System.out.print("Not Present value in string array");
        	
        }
         
    }  
}
