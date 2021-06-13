package org.perscholas.fileandstorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCsvFile {
	public static void main(String [] args) {
		String location = "courses.csv";
		File file = new File(location);
		
		try {
			Scanner input = new Scanner(file);
			List<String []> data = new ArrayList<>();
			String line = "";
			while(input.hasNextLine()) {
				line = input.nextLine();
				data.add(line.split(","));
			}
			for(String[] str: data) {
				System.out.printf("%s |%s | %s%n", str[0],str[1],str[2]);
			}
			input.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		
	}

}
