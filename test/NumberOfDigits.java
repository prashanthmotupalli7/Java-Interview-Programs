package test;

public class NumberOfDigits {
	
	static int numOfDigits(int n) {
		int count=0;
		while(n>0) {
			n/=10;
			count++;
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n=98765;
		System.out.println(numOfDigits(n));
	}

}
