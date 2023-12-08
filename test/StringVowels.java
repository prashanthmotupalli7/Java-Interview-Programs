package test;

import java.util.Arrays;
import java.util.List;

public class StringVowels {
	
	public static int vowelCount(String str) {
		String strLower=str.toLowerCase();
		int count =0;
		List<Character> vowels=Arrays.asList('a','e','i','o','u');
		for(int i=0;i<strLower.length();i++) {
			char ch=strLower.charAt(i);
			if(vowels.contains(ch)) {
				count++;
			}
		}
		return count;
	}
	public static void vowelAndConsonantCount(String str) {
		String strLower=str.toLowerCase();
		int vowelCount =0;
		int consonentCount =0;
		List<Character> vowels=Arrays.asList('a','e','i','o','u');
		for(int i=0;i<strLower.length();i++) {
			char ch=strLower.charAt(i);
			if(vowels.contains(ch)) {
				vowelCount++;
			}
			else if((ch>='a'&&ch>='z')) {
				consonentCount++;
			}
			
			
		}	
		System.out.println("Vowels Count :"+vowelCount);
		System.out.println("consonentCount Count :"+consonentCount);

	}
	
	public static void main(String[] args) {
		String str="Prashanth Motupalli";
	System.out.println(vowelCount(str));
	vowelAndConsonantCount(str);
		
	}

}
