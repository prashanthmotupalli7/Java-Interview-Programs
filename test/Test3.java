package test;

public class Test3 {
	public static void main(String[] args) {
		
	
	String str="abc";
	
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
		//String result=	str.charAt(i)+str.charAt(j);
			System.out.println(str.substring(i, j));
		}
	}
	/*nput:

		String lengthyString = "abc";

		output:

		a

		b

		c

		ab

		bc

		abc
*/



	}


}
