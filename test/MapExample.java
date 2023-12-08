package test;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String,String> map= new HashMap<>();
		map.put("Ramu", "Tax Dept");
		map.put("Sudha", "Office Dept");
		map.put("bunny", "Congress leader");

		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
