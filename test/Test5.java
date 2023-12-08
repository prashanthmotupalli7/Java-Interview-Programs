package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
int a[] ={1,1,2,2,3,4}

3,4*/
public class Test5 {

	
	public static void main(String[] args) {
	Set<Integer> set= new HashSet<>();
	Set<Integer> set1= new HashSet<>();
	 Map<Integer, Integer> map= new HashMap<>();
			Integer[] arr= {1,1,2,2,3,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					set.add(arr[i]);
				//System.out.println(arr[i]);
			}else if(!set.contains(arr[i])) {
				set1.add(arr[i]);
			}
		
	}
		
		
	}
		System.out.println(set1);

	}
}


