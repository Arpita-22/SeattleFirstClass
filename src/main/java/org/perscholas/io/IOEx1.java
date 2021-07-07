package org.perscholas.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx1 {

	public static void main(String[] args) throws IOException {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		File readin = new File("sample.txt");
		File writeto = new File("sampleTo.txt");
		
		try {
			inputStream = new FileReader(readin);
			outputStream = new FileWriter(writeto);
			int c;
			while((c = inputStream.read() ) != -1){
				System.out.println(c);
				outputStream.write(c);
				
			}
			
		}finally {
			if(inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
			
		}
		
//		System.out.println("c:" + c);

	}

}
