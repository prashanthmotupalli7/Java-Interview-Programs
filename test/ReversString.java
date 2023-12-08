package test;

public class ReversString {
	
	 static String reverseString(String str) {
		 if(str==null||str.length()<=1) {
			 return str;
		 }
	     else{
	    	 return reverseString(str.substring(1))+str.charAt(0) ;
	    	 
	     }
		 }
		
	
public static void main(String[] args) {
	String str="Zarin Mahmudh";
	System.out.println("Reversing string "+reverseString(str));
}
}
