package org.perscholas;

public class MethodExercises {
//	private  String str;
//	private String str2;
//	
//	public MethodExercises() {
//		this.str = "default";
//	}
//	
//	public MethodExercises(String str2) {
//		this();
//		this.str2 = str2;
//		
//	}
//	public static void main() {
////		talk();
//		MethodExercises str = new MethodExercises();
//		
//	}
//	
//	public static void talk() {
//		
//	}
	private int nSamples;
	private double min = Double.MIN_VALUE;
	private double max = Double.MAX_VALUE;
	private double sum;
	
	public int getnSamples() {
		return nSamples;
	}

	public void setnSamples(int nSamples) {
		this.nSamples = nSamples;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public MethodExercises(double [] values){
		for(int i = 0; i < values.length; i++) {
			double v = values [i];
			if( v < min) {
				min = v;
			}
			if( v > max) {
				max = v;
			}
			sum += v;
			nSamples++;
			
		}
		
	}
	
	public static void main(String [] args) {
		double [] values = new double[100];
		for(int i = 0; i < 100; i++) {
			values[i] = Math.random() * 100;
		}
		MethodExercises me = new MethodExercises(values);
		
		System.out.println(me.getMax());
		System.out.println(me.getMin());
		System.out.println(me.getnSamples());
		System.out.println(me.getSum());
		
	}

}
