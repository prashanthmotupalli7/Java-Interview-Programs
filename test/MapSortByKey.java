 package test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortByKey {
	public static void main(String[] args) {
		Map<String,Integer> unsortedMap= new HashMap<>();
		unsortedMap.put("banana", 2);
        unsortedMap.put("apple", 5);
        unsortedMap.put("grape", 10);
        unsortedMap.put("orange", 3);
        Map<String,Integer> sortedMap= new TreeMap<>(unsortedMap);
        
        for(Map.Entry<String, Integer> entry: sortedMap.entrySet()) {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
	}

}
