package org.perscholas.nestedclass;

public class Example {
	
	public static class NestedExample{
		public static void hello() {
			System.out.println("Hello! from Nested Class ");
			
		}
	}
	
	public class InnerExample{
		public void hello(){
			System.out.println("Hello! from Inner Class");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example.NestedExample.hello();
		
		Example e = new Example();
		Example.InnerExample ie = e.new InnerExample();
		ie.hello();

	}

}
