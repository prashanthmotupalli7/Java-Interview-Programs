package test;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayPairSum {
	
	static int[] findPair(int arr[],int target) {
		HashSet<Integer> set=new HashSet<>();
		for(int num:arr) {
			int complement=target-num;
			if(set.contains(complement)) {
				return new int[] {complement,num};
				
			}
			set.add(num);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]=findPair(arr, 5);
		System.out.println(Arrays.toString(arr1));
		
	}

}
