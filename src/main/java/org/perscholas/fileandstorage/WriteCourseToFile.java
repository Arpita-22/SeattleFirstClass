package org.perscholas.fileandstorage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteCourseToFile {
	public static void main(String[] args) {
		String location = "courses.csv";
//		File file = new File(location);
		try(FileWriter writer = new FileWriter(new File(location), true);) {
//			FileWriter writer = new FileWriter(file, true);
			Course course = new Course("CIS445", "Advanced OOP", "Jack");
			writer.write(String.format("%s,%s,%s%n", course.getCode(),course.getCourse(),course.getInstructor()));
//			writer.write("CIS335, OOPIII, Ben\n");
//			writer.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
