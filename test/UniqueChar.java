package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueChar {
	static void duplicateCharCount(String str){
		Map<Character,Integer> dupcount =new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			dupcount.put(str.charAt(i),dupcount.getOrDefault(str.charAt(i), 0)+1);
		
		}
		for(Map.Entry<Character, Integer> entry:dupcount.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
			}
		}
		
	}
static	int uniqueCharcount(String str) {
		Set<Character> unique=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			unique.add(str.charAt(i));
		}
		return unique.size();

	}
	public static void main(String[] args) {
		String str="BunutyB";
		int size=uniqueCharcount(str);
		duplicateCharCount(str);
		System.out.println("unique char count "+size);
		
	}

}
