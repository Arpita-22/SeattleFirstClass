package org.perscholas;

public class TernaryOperator {
	public static void main(String[]args) {
		int x = 5;
		int y = 6;
		
//		if(x > 0) {
//			y = 1;
//		}else {
//			y = -1;
//		}
		
		y = (x > 0)?1:-1;
		
		System.out.println(y);
		
		
	}
	

}
