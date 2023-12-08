package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeastFrequency {
	
		
		public static List<Integer> findLeastFreq(int[] arr){
			Map<Integer,Long> freqMap=Arrays.stream(arr)
					                        .boxed()
					                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
			Long minFreq=freqMap.values()
					            .stream()
					            .min(Long::compare)
					            .orElseThrow(()-> new RuntimeException("No frequency found!"));
			
			return freqMap.entrySet()
					      .stream()
					      .filter(entry->entry.getValue().equals(minFreq))
					      .map(Map.Entry::getKey)
					      .collect(Collectors.toList());
				
		}
		public static void main(String[] args) {
			int arr[]={1,2,0,3,3,2,5,4,3,8,2,3,4,5,1,4,6,6,8,9,9,9,9,0};
			System.out.println("Least frequency element in an array "+findLeastFreq(arr));
		}
		
	}


