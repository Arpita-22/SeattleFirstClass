package org.perscholas.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) throws IOException {
		Scanner s = null;
		File readin = new File("sample.txt");

		BufferedReader bufferStream = null;
		FileReader inputStream = null;
		
		Double sum = 0D;
		
		try {
			inputStream = new FileReader(readin);
			bufferStream = new BufferedReader(inputStream);
			s = new Scanner(bufferStream);
			
			while(s.hasNext()) {
				if(s.hasNextDouble()) {
					sum += s.nextDouble();
				}else {
					System.out.println(s.next());
				}
			}
			
		}finally {
			if(s != null) {
				s.close();
			}
			
		}
		System.out.println(sum);
	}

}
