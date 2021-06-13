package org.perscholas.fileandstorage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		String location = "hello.txt";
		File file = new File(location);
		try {
			FileWriter writer = new FileWriter(file, true);
			writer.write("Hello.\n");
			writer.write("World.\n");
			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
