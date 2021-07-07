package org.perscholas.intermediateIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("sample2.txt");
			fos = new FileOutputStream("sampleTo3.txt");
			int temp;
			while((temp = fis.read()) != -1) {
				
				fos.write((byte)temp);
				System.out.print(Character.toChars(temp));
				
			}
			System.out.println();
			if(fis != null) {
				fis.close();
			}
			if(fos != null) {
				fos.close();
			}
			
		}catch(Exception e){
			System.out.println(e);
			
		}

	}

}
