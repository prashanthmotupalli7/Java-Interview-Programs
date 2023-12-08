package test;

public class LargestDigit {
	public static int largestDigitJava8(int num) {
		char charMax=Integer.toString(num).chars()
				.mapToObj(c->(char)c)
				.max(Character::compare)
				.orElse('0');
		return Character.getNumericValue(charMax);
	}
	
	public static int smallestJava8(int num) {
		
		char charMin=Integer.toString(num).chars()
				           .mapToObj(c->(char)c)
				           .min(Character::compare)
				           .orElse('0');
		return Character.getNumericValue(charMin);
		
	}
	
	public static int smallestNum(int num) {
		int small=num%10;
		while(num>0) {
			int digit=num%10;
			if(digit<small) {
				small=digit;
			}
			num/=10;
		}
		return small;
	}
	
	public static int largestDigit(int num) {
		int largest=0;
		while(num>0) {
			int digit=num%10;
			if(digit>largest) {
				largest=digit;
			}
			num/=10;
		}
		return largest;
	}

	
	public static void main(String[] args) {
		int n=76832;
	System.out.println("Largest Number using Java 8 : "+largestDigitJava8(n));
	System.out.println("Largest Number using Java :  "+largestDigit(n));
	System.out.println("Smallest Number using Java 8 :  "+smallestJava8(n));
	System.out.println("Smallest Number using Java :  "+smallestNum(n));

	


	}

}
