package org.perscholas.io;

import java.io.File;
import java.io.IOException;

public class DeleteFileOnExit {

	public static void main(String[] args) {
		File temp;
		try {
			temp = File.createTempFile("myTempFile", ".txt");
			System.out.println(temp.getAbsolutePath());
			
//			temp.delete();
			//temp.deleteOnExit();
			System.out.println(temp.exists());
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
