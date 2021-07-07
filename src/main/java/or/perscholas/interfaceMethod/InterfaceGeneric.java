package or.perscholas.interfaceMethod;

public interface InterfaceGeneric<T> {
	
	T compare(T o1, T o2);
	
	public static void main(String [] args) {
		InterfaceGeneric<Integer> nums = new InterfaceGeneric<> (){
			
			@Override
			public Integer compare(Integer o1, Integer o2) {
				if(o1 > o2) {
					return o1;
				}else {
					return o2;
				}
				
			}
		};
		
		InterfaceGeneric<Float> nums2 = new InterfaceGeneric<> (){
			
			@Override
			public Float compare(Float o1, Float o2) {
				if(o1 > o2) {
					return o1;
				}else {
					return o2;
				}
				
			}
		};
		
		int max = nums.compare(13,9);
		System.out.println(max);
		
		float max1 = nums2.compare(14F,11F);
		System.out.println(max1);
	}

}
