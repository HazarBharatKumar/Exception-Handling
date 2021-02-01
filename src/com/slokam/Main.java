package com.slokam;

import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		try {
		     @SuppressWarnings({ "unused", "resource" })
			FileReader fr = new FileReader("D:\\user.txt"); //Checked excption
		}
		catch(Exception e ) {
			System.out.println("Hello Exception is raised");
		}
		
		
		
		@SuppressWarnings("unused")
		int c = 12/0; // unchecked exception
		
		/*A a1 = new A();
		a1.test();*/
		
		// Is this exception or error?
		// If we have compiler errors then we can not run the program.
		
		// If we have warnings we can run the program.
		
	    // Exceptions( Compile time or run time ) raises when you run program.
		
	}
}
