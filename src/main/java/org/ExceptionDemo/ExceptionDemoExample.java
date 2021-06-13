package org.ExceptionDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemoExample {
	public static void main(String [] args) throws Exception{
		
		try {
			readFile("except.txt");
			
		}catch(IOException e){
			System.out.println(e.getMessage());
			
			throw new CustomException("Error in Student.main(): File not found");
		
			
		}finally {
			System.out.println("All done!");
		}
		
	}
	
	public static void readFile(String location) throws IOException{
		File file = new File("except.txt");
		FileReader r = new FileReader(file);
		r.close();
		
	}
	

}
