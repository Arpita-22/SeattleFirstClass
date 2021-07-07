package or.perscholas.interfaceMethod;

public class FuncExample {

	public static void main(String[] args) {
		
//		MyFunctionalInterface msg1  = () ->  {return "Hello";};
		MyFunctionalInterface msg2  = () ->   "Hello";
		
		System.out.println(msg2.sayHello());
		

	}

}
