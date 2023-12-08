package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateFreq {

	public static Map<Integer,Long> duplicateFrequency(int[] arr){
		Map<Integer,Long> freqElement=Arrays.stream(arr)
				                            .boxed()
				                            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				                     
				                      return freqElement.entrySet()
				                    		            .stream()
				                    		            .filter(entry->entry.getValue()>1)
				                    		            .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	}
	public static void findDuplicate(int[] arr) {
	Set<Integer> uniquieElements=new HashSet<>();
	Set<Integer> duplicateElements=Arrays.stream(arr)
			                             .filter(i->!uniquieElements.add(i))
			                             .boxed()
			                             .collect(Collectors.toSet());
	System.out.println(duplicateElements);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1,4,6,7,9};
		findDuplicate(arr);
		System.out.println("Arrays duplicate with their frequency count  : "+duplicateFrequency(arr));
		
	}
}
