package test;

public class WordVowelCharCount {

	public static int wordCount(String str) {
		String trimmed=str.trim();
		if(trimmed.isEmpty()) {
			return 0;
		}
		return trimmed.split("\\s+").length;
	}
	
	public static int vowelCount(String str) {
		int count=0;
		String vowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++) {
			if(vowels.indexOf(str.charAt(i))!=-1){
				count++;
				
			}
		}
		return count;
	}
		

	
public static int charCount(String str) {
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' '){
			count++;
			
		}
	}
	return count;
}
	public static void main(String[] args) {
	 String str="I can see you you can hear me";
	 int word=wordCount(str);
	 int vowels=vowelCount(str);
	 int countChar=charCount(str);
	 
	 
	 
	 
	 System.out.println("Word Count       : "+word);
	 System.out.println("Vowels Count     : "+vowels);
	 System.out.println("Character Count  : "+countChar);

	}
}
