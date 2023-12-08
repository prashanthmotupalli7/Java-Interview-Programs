package test;

public class VarArg {
	
	void add(int ...a) {
		int sum=0;
		for(int x:a) {
		sum=sum+x;
		}
		System.out.println("Sum of numbers : "+sum);
	}
public static void main(String[] args) {
	VarArg a =new VarArg();
	a.add(1);
	a.add(1,2,3);
	
	
	
	

}
}
