package test;

public class ReverseWords {

	public static String ReverseString(String words) {
		String[] wordSplit=words.split(" ");
        StringBuilder reversedString = new StringBuilder();

		for(int i=wordSplit.length-1;i>=0;i--) {
            reversedString.append(wordSplit[i]).append(" ");
		}
		return reversedString.toString().trim();
	}
	
	public static void main(String[] args) {
		String words="Hello This is Prashanth";
		System.out.println(ReverseString(words));
		
	}
}
