package test;

public class SentencePallindrome {
public static boolean isStrPallindrome(String str) {
	int low=0;
	int high=str.length()-1;
	while(low<high) {
		char ch1=str.charAt(low);
		char ch2=str.charAt(high);
		
		if(ch1!=ch2) return false;
		low++;
		high--;
	}
	return true;
	
}
public static boolean isSentencePallindrome(String s) {
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		
		if(( ch>='a'&& ch<='z')||( ch>='A'&& ch<='Z')||( ch>='0'&& ch<='9')) {
			if( ch>='A'&& ch<='Z') res+=(char)(ch+32);
			else res+=ch;
			}
			else continue;
		}
    if(isStrPallindrome(res)) return true;
    return false;
}
	

	public static void main(String[] args) {
		String str=" 2 Race, e cAr 2";
	System.out.println(isSentencePallindrome(str));
	}
}
