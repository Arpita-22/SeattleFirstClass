package org.perscholas;

//import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListExercise {

	public static void main(String[] args) {
		String[] StrArr = {"red","blue"};
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<Integer> intList = new ArrayList<>(Arrays.asList(2,3,1,4,5));
		intList.sort((x, y) -> x.compareTo(y));
		System.out.println(intList);
//		 intList.add(6);
//		System.out.println(intList);
//		System.out.println(intList.indexOf(3));
//		System.out.println(intList.contains(8));
//		System.out.println(intList.remove((Integer)3));
//		System.out.println(intList);
//		System.out.println(intList.get(2));
//		System.out.println(intList.set(0, 8));
//		System.out.println(intList);
//		
//		int sum = 0;
//		for(Integer i :intList) {
//			sum += i;
////			System.out.println(i);
////			System.out.println(sum);
//		}
//		System.out.println(sum);
		
		System.out.println(intList.getClass().getName());
		
		
		List<Integer> listA = Arrays.asList(3, 4, 6, 7, 9, 12, 15, 17, 23);
		List<Integer> listB = Arrays.asList(3, 5, 7, 9, 10, 13, 15, 18, 23);
		
		List<Integer> listC = new ArrayList<>();
		
		//Solution using dual index
		for(int i = 0, j = 0; i < listA.size() && j < listB.size();) {
			Integer iA = listA.get(i), iB = listB.get(j);
			if(iA < iB){
				i++;
				
			}else if(iB < iA) {
				j++;
			}else {
				listC.add(iA);	
				i++; 
				j++;
			}
			
		}
		
		System.out.println(listC);
		
		//Solution using Binary search
		
		for(Integer i: listA) {
			if(Collections.binarySearch(listB, i) >= 0) {
				listC.add(i);
			}
		}
		System.out.println(listC);
		
		
        List<Integer> list4 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the list:");
        int n = input.nextInt();
        int val;
        int index;
        for(int i = 0; i < n; i++){
        	System.out.println("Please enter an integer value to be added:");
            val = input.nextInt();
            list4.add(val);   
        }
        
        
        int j = 0;
        System.out.println("Please enter the number of queries");
        int queries = input.nextInt();
        while(j < queries){
        	System.out.println("Please enter insert or delete:");
            String response = input.next();
            if(response.equalsIgnoreCase("Insert")){
            	System.out.println("Please enter the index:");
                index = input.nextInt();
                System.out.println("please enter the value:");
                val = input.nextInt();
                list4.add(index, val);       
            }
            else{
            	System.out.println("Please enter the index:");
                index = input.nextInt();
                list4.remove(index);  
            } 
             j++; 
        }
           
        input.close();
        for(Integer elements: list4){
            System.out.print(elements + " ");
        } 
         
        
		
		

	}

}
