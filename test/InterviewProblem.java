package test;

import java.util.Arrays;

public class InterviewProblem {
public static void main(String[] args) {
	
	String str="aabbccdd";
	int n=str.length();
	String res="";
	char[] c=str.toCharArray();
	char[] c1 = new char[c.length];
  

	for(int i=0;i<c.length-1;i++) {
		if(c[i]==c[i+1]) {
			i++;
			c1[i]=c[i];
		 //res+=str.charAt(i);
	}
		//res+=str.charAt(i);
		
	}

	System.out.println(Arrays.toString(c1));
}
}