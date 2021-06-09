package org.perscholas;
import java.util.Arrays;
public class Array {
	public static void main(String [] args) {
//		int [] arr = new int[5];
//		double [] myList = {1.3,3.5,6.7,9.8};
//		arr[0] = 1;
//		arr[1] = 1;
//		arr[2] = arr[0] + arr[1];
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[2]);
//		arr[2] = arr[0] + arr[1];
//		System.out.println(Arrays.toString(myList));
//		highestAverage();
//		deckOfCards();
		int [] arr = {1,2,3,4,5};
//		deleteElefromArr(arr,2);
		insertEleAtArr(arr,1,9);
	}
		

	
//	public static void highestAverage() {
//		int [] arr = new int[100];
//		int sum = 0;
//		int count = 0;
//		for(int i = 1; i <= arr.length; i++) {
////			arr[i - 1] = (int)(Math.random() * 100);
//			arr[i - 1] = i;
//			sum += i;
////			sum += arr[i - 1];
//	
//		}
////		System.out.println(sum);
//		int avg = sum/100;
////		System.out.println(avg);
//		for(int i = 1; i <= arr.length; i++) {
//			if(arr[i - 1] > avg) {
//				count++;
//			}
//	
//		}
//		System.out.println("The number of elements above average" + " " +count);
////		
//	}
	
	public static void highestAverage() {
		int [] arr = new int[100];
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= arr.length; i++) {
			arr[i - 1] = i;
			sum += arr[i - 1];
	
		}

		int avg = sum/arr.length;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > avg) {
				count++;
			}
	
		}
		System.out.println("The number of elements above average" + " " +count);
		
	}
	
	public static void deckOfCards() {
		int [] deck = new int [52];
		String [] cardNo = {"Ace", "2","3","4","5","6","7","8","9",
	"Jack","Queen","King"};
		String [] cardType = {"Spades", "Hearts","Diamonds","Clubs"};
		String cardSuit;
		
//		//initialize cards
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
//			


	    int randNo = 29;
		
		if(randNo % 13 == 0) {
			System.out.println("Ace");
		}else if(randNo % 13 >=1 && randNo % 13 <= 9) {
			System.out.printf("%d",(randNo % 13) + 1);
			String.format("%d",(randNo % 13) + 1);
		}
		else if(randNo % 13 == 10) {
			System.out.println("Jack");
		}else if(randNo % 13 == 11) {
			System.out.println("Queen");
		}else if(randNo % 13 == 12) {
			System.out.println("King");
		}
			
		
	}
	
	public static void deleteElefromArr(int [] vals, int indexToDelete){
		for(int i = indexToDelete; i < vals.length - 1; i++) {
			vals[i]  = vals[i + 1];
		}
		System.out.println(Arrays.toString(vals));	
	}
	
	public static void insertEleAtArr(int [] vals, int indexToInsert, int val){
		for(int i = indexToInsert; i < vals.length - 1; i++) {
			vals[i + 1] = vals[i];
		}
		vals[indexToInsert] = val; 
		System.out.println(Arrays.toString(vals));
	}
	
	

}
