package or.perscholas.interfaceMethod;

public interface FuctionalAbstraction {
	
	public void print();

	public static void main(String[] args) {
		 FuctionalAbstraction ex1 = new FuctionalAbstraction(){
			 @Override
			 public void print() {
				 System.out.println("Hello!");
			 }
		 };
		 
		 FuctionalAbstraction ex2 = new FuctionalAbstraction(){
			 @Override
			 public void print() {
				 System.out.println("World!");
			 }
		 };
		 
		 ex1.print();
		 ex2.print();

	}

}
