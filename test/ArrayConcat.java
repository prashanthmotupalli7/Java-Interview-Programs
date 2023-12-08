package test;

import java.util.Arrays;

public class ArrayConcat {

public static void main(String[] args) {
	
	int[] arr1= {1,2,3,4,5};
	int[] arr2= {6,7,8,9,10};
	int[] resultArray= new int[arr1.length+arr2.length];
	System.arraycopy(arr1, 0, resultArray, 0, arr1.length);
	System.arraycopy(arr2, 0, resultArray, arr1.length, arr2.length);

		System.out.println(Arrays.toString(resultArray));
	}
}
