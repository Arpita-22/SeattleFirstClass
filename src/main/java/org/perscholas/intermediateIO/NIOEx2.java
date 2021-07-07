package org.perscholas.intermediateIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOEx2 {

	public static void main(String[] args) {
		Path file = null;
		BufferedReader bufferedReader = null;
		try {
			file = Paths.get("sample3.txt");
			InputStream inputStream = Files.newInputStream(file);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			System.out.println("1st line: "+ bufferedReader.readLine() );
			System.out.println("2nd line: "+ bufferedReader.readLine() );
			
		}catch(IOException e){
			e.printStackTrace();
			
		}finally {
			try {
				bufferedReader.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
				
			}
			
		}

	}

}
