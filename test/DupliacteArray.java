package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupliacteArray {
	
	static void printDuplicate(int[] arr) {
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					//System.out.print(arr[i]+" ");
					s.add(arr[i]);
					break;
				}
			}
		}
		System.out.println(s);
	}
	public static void findDupArr(int arr[]) {
		Map<Integer,Integer> map= new HashMap<>();
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}
		System.out.println("Duplicates using Map");
		for(int i:map.keySet()) {
			if(map.get(i)>1) {
				System.out.println(i);
			}
		}
	}
	
	public static void printDuplicateUsingJava8(String str) {
		String cleanedString=str.replaceAll(" ", "").toLowerCase();
		Map<Character, Long> charCountMap=new HashMap<>();
		charCountMap=cleanedString.chars().mapToObj(c->(char)c)
				                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); 
				        
		charCountMap.forEach((character,count)->{
			if(count>1) {
				System.out.println("Character - "+character+" : "+"COUNT - "+count);
			}
		});
	}
	
	public static void main(String[] args) {
	int[] arr= {1,2,4,3,1,3,45,6,78,9,1};
	findDupArr(arr);
	String string="Bhole Shivalli";
	printDuplicateUsingJava8(string);
	printDuplicate(arr);
	}

}
