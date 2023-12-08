package test;



public class GCD {

	
	
	static int gcd2(int n1,int n2) {
		int min=0;
		if(n1<n2) {
			min=n1;
			
		}
		else {
			min=n2;
		}
		
		for(int i=min;i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				return i;
			}
		}
		return 1;
	}
	public static int gcd(int a,int b) {
		if(b==0)
		{
			return a;
		}
		return gcd(b,a%b);
	
	}
	
	public static int lcm(int a,int b) {
		return(a*b)/gcd(a,b);
	}
	
	public static void main(String[] args) {
		int n1=12;
		int n2=32;
		System.out.println("GCD of 2 DSA  :"+gcd2(n1, n2));
		int gcdOf2=gcd(n1,n2);
		int lcmOf2=lcm(n1,n2);
		System.out.println(lcmOf2 );
		System.out.println(gcdOf2);
	}
}




