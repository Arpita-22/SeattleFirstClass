package org.perscholas.abstractclass;

public class StudentApp {
	public static void main(String [] args) {
		AbstractStudent student = new Student();
		student.setFirstName("Mike");
		student.setLastName("Fork");
		student.setGpa(4.0);
		student.getInfo();
		
	}

}
