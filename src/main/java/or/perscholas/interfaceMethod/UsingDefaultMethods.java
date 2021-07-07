package or.perscholas.interfaceMethod;

public class UsingDefaultMethods implements FuncInterWithDefault {

	public static void main(String[] args) {
		
//		FuncInterWithDefault fid = new FuncInterWithDefault() 
//		{
//
//			@Override
//			public void square(int a) {
//				System.out.println(a * a);
//			}
//
//	
//		};
		
		
		UsingDefaultMethods fid = new UsingDefaultMethods();
		{

			fid.square(10);
			fid.show();


	
		};
		FuncInterWithDefault fid1 = a -> System.out.println(a * a);
		
		fid1.square(10);
		fid1.show();
	}
	
	@Override
	public void square(int a) {
		System.out.println(a * a);

	}

}
