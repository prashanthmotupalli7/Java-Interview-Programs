package test;

public class LongestPallindrome {
	
	static String longestPallindrome(String str) {
		int n=str.length();
		String res="";
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				String sub=str.substring(i, j);
				if(isPallindrome(sub) && sub.length()>res.length()) {
					res=sub;
				}
			}
		}
		return res;
	}
	
	static boolean isPallindrome(String str) {
		int n=str.length();
		for(int i=0;i<(n/2);++i) {
			if(str.charAt(i)!=str.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str="abbababcdcba";
		String longestSubPallindrome=longestPallindrome(str);
		System.out.println("Longest Sub String Pallindrome :"+longestSubPallindrome);
		
	}

}
