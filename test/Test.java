package test;

/*String lengthyString = "abcdefabcxyzabc";

String findString = "abc";*/
public class Test {

	public static void main(String[] args) {
		
		String lengthyString = "abababababa";
		String findString = "aba";
		int count=0;
		for(int i=0;i<lengthyString.length();i++) {
		  for(int j=i+1;j<lengthyString.length();j++) {
			  if(lengthyString.substring(i,j).equals(findString)) {
				  count++;
			  }
			  
		  }
		}
		
	System.out.println(count+1);
		
		
	}
	
}
