package test;

import java.util.Arrays;

public class NthLargest {
	
	public static int  nthSmall(int[] arr,int n) {
		Arrays.sort(arr);
		return arr[n-1];
	}
	public static int  nthLarge(int[] arr,int n) {
		Arrays.sort(arr);
		return arr[arr.length-n];
	}
	
	public static void main(String[] args) {
		int arr[]= {33,56,7,4,23,90,76};
		int n=3;
		System.out.println("N th Largest element "+nthLarge(arr, n));
		System.out.println("N th Smallest element "+nthSmall(arr, n));

	}

}
