package or.perscholas.interfaceMethod;

public class FuncExample2 {

	public static void main(String[] args) {
		
		MyFunctionalInterface2 f = (num) -> num+5;
		
		System.out.println(f.incrementByFive(22));

	}

}
