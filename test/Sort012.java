package test;

import java.util.Arrays;

public class Sort012 {
	
	public static void sortArr(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,0,2,0,1,2,0,1,1,0,2};
		sortArr(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
