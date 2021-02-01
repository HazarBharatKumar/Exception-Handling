package com.slokam;

import java.io.FileReader;

public class B {

	public void test() {
		 System.out.println("Test");
		 // Missing or wrong syntax: Compiler errror.
		 
		// FileReader constructor  raises File not found exception at run time, If file is not available.
		// exception is also an object  , 
			
		    try {
		         @SuppressWarnings({ "unused", "resource" })
				FileReader fr = new FileReader("D:\\userasdf.txt"); //This statement raised the exception(FileNotFound Exception)
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
		    //type of exception is FilNotFoundExcption (External)
			// Which Exceptions are strict to proved try ,catch block. they are external exceptions(compiletime or checked) 
		    // FileReader 
			 
			 int a[] =new int [10] ;
			 System.out.println(a[12]); //this raising ArrayIndexOutofbounds
			 
			 
		 
	}
}
