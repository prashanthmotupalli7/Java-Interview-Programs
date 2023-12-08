package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSortByValue {

	public static void main(String[] args) {
		
		Map<String,Integer> unsortedMap= new HashMap<>();
		unsortedMap.put("banana", 2);
        unsortedMap.put("apple", 5);
        unsortedMap.put("grape", 10);
        unsortedMap.put("orange", 3);
     List<Entry<String, Integer>> sorted=unsortedMap.entrySet()
    		                                            .stream()
    		                                            .sorted(Map.Entry.comparingByValue())
    		                                            .collect(Collectors.toList());
     
     Map<String, Integer> sortedMap = new LinkedHashMap<>();
     for (Map.Entry<String, Integer> entry : sorted) {
         sortedMap.put(entry.getKey(), entry.getValue());
     }
    		                                            
     for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
    	 System.out.println(entry.getKey()+" : "+entry.getValue());
     }
     
        
		
	}
}
