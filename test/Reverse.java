package test;

public class Reverse {
	
	public static int reverseNum(int num) {
		int rev=0;
		while(num!=0) {
			int digit =num%10;
			rev=rev*10+digit;
			num/=10;
		}
		return rev;
	}
	public static String reverseString(String str) {
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr+=str.charAt(i);
		}
		return revStr;
		
	}
	public static void main(String[] args) {
		int orginalNumber=123;
		String name="Prashanth";
	String reverseName=reverseString(name);
	int revNum=	reverseNum(orginalNumber);
	System.out.println("ORGINAL NUM : "+orginalNumber+"  "+"REVERSE NUM : "+revNum);
	System.out.println("ORGINAL STR : "+name +"  "+"REVERSE STR : "+reverseName);

	}
	
}

