package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NonRepetiveFirst {
  public static void main(String[] args) {
	  int[] arr= {1,2,3,1,3,4,5,9,5,3,2,6,8,7,4};
	  Map<Integer,Integer> map= new HashMap<>();
	  ArrayList<Integer> ant= new ArrayList<>();

	  for(int a:arr) {
		  map.put(a, map.getOrDefault(a,0)+1);
		  
	  }
	  for (int a : arr) {
          if (map.get(a) == 1) {
              System.out.println(a);
              break; // stop after printing the first non-repetitive number
          }
	 
	}
}
}

