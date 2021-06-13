package org.perscholas.fileandstorage;

public class Course {
	private String code;
	private String course;
	private String instructor;
	
	public Course(String code, String course, String instructor){
		this.code = code;
		this.course = course;
		this.instructor = instructor;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}
