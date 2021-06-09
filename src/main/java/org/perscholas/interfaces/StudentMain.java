package org.perscholas.interfaces;

import java.util.List;

public class StudentMain {
	public static void main(String [] args) {
		StudentI student1 = new Student1();
		student1.setName("Mike");
		student1.introduceSelf();
		
		StudentI student2 = new Student2();
		student2.setName("Kevin");
		student2.introduceSelf();
		
//		List <String> list = new ArrayList<>();
		
	}

}
