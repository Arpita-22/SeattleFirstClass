package or.perscholas.interfaceMethod;

public class MyCalc {

		
		Calculator<Integer> sum = ( num1, num2) -> {
			
			return num1 + num2 ;
		};
		
		Calculator<Integer> subtract = ( num1, num2) -> {
			
			return num1 - num2;
		};
		
		Calculator<Float> multiply = ( num1, num2) -> {
			
			return num1 * num2;
		};
		
		Calculator<Float> divide = ( num1, num2) -> {
			
			return num1/num2;
		};


}
