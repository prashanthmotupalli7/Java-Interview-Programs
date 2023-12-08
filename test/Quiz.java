package test;

public class Quiz {
	int i=m1();
	
	Quiz(){
		System.out.println("quiz constructor");
	}
	
int m1() {
	System.out.println("m1-method");
	return 20;
}
{
	System.out.println("instance block");
}
public static void main(String[] args) {
	//Quiz q=new Quiz();
}
}
