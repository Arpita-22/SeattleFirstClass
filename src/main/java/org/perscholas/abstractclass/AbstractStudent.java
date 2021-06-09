package org.perscholas.abstractclass;

public abstract class AbstractStudent {
	protected String firstName;
	protected String lastName;
	protected double gpa;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public abstract String[] getName();
	public abstract void getInfo();
	

}
