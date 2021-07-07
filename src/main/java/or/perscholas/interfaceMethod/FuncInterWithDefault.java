package or.perscholas.interfaceMethod;



//@FunctionalInterface
public interface FuncInterWithDefault {
	public void square(int a);
	
	default void show() {
		System.out.println("Default method executed");
	}
}


