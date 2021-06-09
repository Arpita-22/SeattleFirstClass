package org.perscholas;

import java.util.Arrays;

public class SortingExercises {
//	public static void main(String [] args) {
//		int [] nums = {4, 2, 9, 13, 1, 0};
//		mergeSort(nums);
//		
//	}
//	
//	public static void mergeSort(int [] nums) {
//		
//		int n = nums.length;
//		int left = 0;
//		int right = nums.length - 1;
//		if(n < 2) {
//			return; 
//		}
//		int mid = (left + right)/2;
//		int [] l = new int [mid];
//		int [] r = new int [n - mid];
//		
//		for(int i = 0 ; i < mid; i++) {
//			l[i] = nums[i];
//		}
//		for(int i = mid ; i < n; i++) {
//			r[i - mid] = nums[i];
//		}
//		mergeSort(l);
//		mergeSort(r);
//		merge(nums,l,r);
//		System.out.println(Arrays.toString(nums));
//			
//		
//	}
//	
//	public static void merge(int [] nums, int [] l, int [] r) {
//		int left = l.length;
//		int right = r.length;
//		
//		int i = 0,j = 0, k = 0;
//		while(i < left && j < right) {
//			if(l[i] <= r[j]) {
//				nums[k++] = l[i++];
//			}else {
//				nums[k++] = r[j++];
//			}
//		}
//		
//		while(i < left) {
//			nums[k++] = l[i++];
//		}
//		while(j < right) {
//			nums[k++] = r[j++];
//		}	
//		
//	}
	
	public static void main(String[] args) {
		int[] myArr = {1,6,3,8,5,3,4,6};
		mergeSort(myArr);
		System.out.println(Arrays.toString(myArr));
	}
	
	public static void mergeSort(int[] values) {
		int[] tempValues = values.clone();
		mergeSort(tempValues, 0, values.length, values);
	}
	
	private static void mergeSort(int[] tempValues, int i0, int i1, int[] values) {
		if (i1 - i0 < 2) {
			return;
		}
		int iMid = (i0 + i1)/2;
		mergeSort(values, i0, iMid, tempValues);
		mergeSort(values, iMid, i1, tempValues);
		merge(tempValues, i0, iMid, i1, values);
	}
	
	public static void merge(int[] source, int iBegin, int iMid, int iEnd, int[] dest) {
		int i = iBegin;
		int j = iMid;
		
		for (int k = iBegin; k < iEnd; k++) {
			if (i < iMid && (j >= iEnd || source[i] < source[j])) {
				dest[k] = source[i++];
			} else {
				dest[k] = source[j++];
			}
		}
	}

}
