package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepatingChar {

	public static void nonRepeatChar(String str) {
	Map<Character,Integer> charCount= new LinkedHashMap<>();
	for(char c:str.toCharArray()) {
		charCount.put(c, charCount.getOrDefault(c, 0)+1);
			
		}
	
	
	for(Map.Entry<Character, Integer> entry:charCount.entrySet()) {
		if(entry.getValue()==1) {
			System.out.print(entry.getKey()+" ");
		}
	}
		
	}
					
public static void main(String[] args) {
	String str="prashanth motupalli";
	int n=543887;
	String str2=String.valueOf(n);
	nonRepeatChar(str2);	
	nonRepeatChar(str);	
}
}
