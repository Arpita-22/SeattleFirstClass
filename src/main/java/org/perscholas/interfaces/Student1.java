package org.perscholas.interfaces;

public class Student1 implements StudentI{
	
	String name;
	

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
		
	}

	@Override
	public void introduceSelf() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " " + this.SCHOOL);
		
	}

}
