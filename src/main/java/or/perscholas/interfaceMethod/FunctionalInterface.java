package or.perscholas.interfaceMethod;

public class FunctionalInterface {

//	@FunctionalInterface
//	public interface FuncInterWithDefault {
//		public void square(int a);
//		
//		default void show() {
//			System.out.println("Default method executed");
//		}
//	}




//	public class UsingDefaultMethods implements FuncInterWithDefault {
//
//		public static void main(String[] args) {
//			
//			FuncInterWithDefault fid = new FuncInterWithDefault() 
//			{
//	
//				@Override
//				public void square(int a) {
//					System.out.println(a * a);
//				}
//	
////			
//			};
//			
//			FuncInterWithDefault fid = a -> System.out.println(a * a);
//			
//			fid.square(10);
//			fid.show();
//		}
//		
//		@Override
//		public void square(int a) {
//			System.out.println(a * a);
//	
//		}
//
//	}
//
//
//	package org.perscholas.myinterface;
//
//	@FunctionalInterface
//	public interface MyInterface {
//		void myMethod();
//		
//		default void defaultMethod() {
//			System.out.println("Default Method");
//		}
//		
//		static void staticMethod() {
//			System.out.println("MyInterface static method.");
//		}
//	}
//
//
//	package org.perscholas.myinterface;
//
//	public class MyInterfaceApp {
//
//		public static void main(String[] args) {
//			MyInterface myInterface = new MyInterface() {
//				@Override
//				public void myMethod() {
//					System.out.println("Good morning everyone!!!");
//				}
//			};
//			
//			myInterface.myMethod();
//			myInterface.defaultMethod();
//			MyInterface.staticMethod();
//		}
//	}

}
