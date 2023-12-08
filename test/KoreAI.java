package test;

import java.util.Arrays;

public class KoreAI {
	
	public static int[] rotateArray(int[] arr, int k) {
		int n=arr.length;
		int[] rotatedArray=new int[n];
		System.arraycopy(arr, n-k, rotatedArray, 0, k);
		System.arraycopy(arr, 0, rotatedArray, k,n-k);
		return rotatedArray;

	}


	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
    int roate[]=rotateArray(arr,2);
    System.out.println(Arrays.toString(roate));

}

	
	}