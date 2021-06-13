package org.perscholas.fileandstorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadScanner {
	
	public static void main(String[]args) {
		String location = "colors.txt";
		File file = new File(location);
		List<String> list = new ArrayList<>();
		
		try {
			Scanner input = new Scanner(file);
			String data = " ";
			while(input.hasNextLine()) {
//				data += input.nextLine();
				list.add(input.nextLine());
			}
			System.out.println(list);
			for(String line: list) {
				System.out.println(line);
			}
			input.close();
		}catch(FileNotFoundException e){
			System.out.println("File not Found");
		}
		
	}

}
