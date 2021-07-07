package org.perscholas.io;

import java.io.File;

public class ListOfFileNames {

	public static void main(String [] args) {
		File file = new File("/Users/arpita");
		String[] fileList = file.list();
		
		for(String name: fileList) {
			System.out.println(name);
		}

	}

}
