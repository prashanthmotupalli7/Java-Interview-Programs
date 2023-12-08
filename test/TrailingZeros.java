package test;

public class TrailingZeros {
  static int taril0(int n) {
	 int powerOf5=5;
	 int res=0;
	 while(n>=powerOf5) {
		 res+=n/powerOf5;
		 powerOf5*=5;
	 }
	return res;
  }
	
	public static void main(String[] args) {
		int n=5;
		System.out.println("Trailing Zeros : "+taril0(n));
	}
}
