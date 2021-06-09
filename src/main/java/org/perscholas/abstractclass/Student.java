package org.perscholas.abstractclass;

public class Student extends AbstractStudent {

	@Override
	public String[] getName() {
		String [] name = {this.firstName, this.lastName};
		return name;
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(" Hi, my name is" + this.firstName + " "+ this.lastName);
		System.out.println(this.gpa);
		
	}
	

}
