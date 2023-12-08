package test;

import java.util.Arrays;

public class ArrayFinal {
	
	
	
	public static void main(String[] args) {
		
		final int[] arr= {1,2,3,4,5};
		arr[0]=7;
		System.out.println(Arrays.toString(arr));
		//arr=new int[10];
	}

}
