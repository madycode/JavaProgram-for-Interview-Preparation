package com.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ParallelStream {
	// Main method  
	public static void main(String[] argvs) throws IOException   
	{  
	  
	// Creating a File object  
	File f = new File("C:\\Users\\Nikhil\\Downloads\\ParallelStreams\\parallelstream.txt");  
	  
	// A Stream of the string type using the method line() is created  
	// for reading only one link at a time from the mentioned text file  
	Stream<String> txt = Files.lines(f.toPath());  
	  
	// Creating the parallel streams using the parallel() method  
	// and later using the forEach() in order to print on the console  
	txt.parallel().forEach(System.out::println);  
	  
	// the Stream is closed by invoking the close() method  
	txt.close();  
	}  

}
