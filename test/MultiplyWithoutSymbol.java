package test;

public class MultiplyWithoutSymbol {
	public static int multiplywithoutSymbol(int a,int b) {
		 int result =0;

		for(int i=1;i<=b;i++) {
			result+=a;
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		System.out.println(multiplywithoutSymbol(5,9));
		
	}

}
