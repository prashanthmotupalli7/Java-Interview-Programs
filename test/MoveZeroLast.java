package test;

import java.util.Arrays;

public class MoveZeroLast {
	
	public static void zeroLast(int[] arr) {
		int k=0;
		for(int a:arr) {
			if(a!=0) {
				arr[k++]=a;
			}
		
		}
		for(int i=k;i<arr.length;i++) {
			arr[i]=0;
			
		}
	}
	
	public static void main(String[] args) {
	int arr[]= {10,0,9,8,0,7,6,0,4,2};
	zeroLast(arr);
	System.out.println(Arrays.toString(arr));
	}

}
