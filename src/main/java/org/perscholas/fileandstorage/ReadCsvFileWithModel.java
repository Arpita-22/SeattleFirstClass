package org.perscholas.fileandstorage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ReadCsvFileWithModel {

	public static void main(String [] args) {
		String location = "courses.csv";
		File file = new File(location);
		
		try {
			Scanner input = new Scanner(file);
			List<Course> data = new ArrayList<>();

			while(input.hasNextLine()) {
				String[] courseArr = input.nextLine().split(",");
				data.add(new Course(courseArr[0], courseArr[1], courseArr[2]));
			}
			for(Course course: data) {
				System.out.printf("%-15s | %-35s | %-25s%n", course.getCode(), course.getCourse(), course.getInstructor());
			}
			input.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
	}

}
