package com.slokam;

import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		
		String str ="33";
		int intData = Integer.parseInt(str);
		System.out.println(intData);
		int c = 23 / 2;
		System.out.println(c);
		
		int arr[] = new int[] {2,4,5,2,434,3434,34};
		if(arr.length >= 6) {
		     System.out.println(arr[5]);
		}
		
		//1. Internal exceptions
		    // Not required any try catch block  or exception handling
		//2. External exceptions Compile time exception
	    	// Required  try catch block  or exception handling
		
		// from the program you are reading File data.
		
		// Any Exception raises at runtime , that may be runtime or compile time exception. 
		
		// Compiler verifies java code contains exception handling or not for External exceptions or
		// checked exceptions or compile time exceptions 
		
		// For internal exception no need to provide exception handling. Unchecked exception,runtime ecptions
			try{
			   @SuppressWarnings("resource")
			FileReader fr = new FileReader("D:\\user.txt");
			   fr.read();
			   System.out.println("Reading the data.");
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Hello");
			}
			
			
		   // 1. we are interacting with FileSystem form java. contacting external system. Now we 
		   //    have to deal with External exceptions.
		
	}
}
