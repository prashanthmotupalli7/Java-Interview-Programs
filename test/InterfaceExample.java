package test;

interface Interface1{
	public static final String PERSON_NAME="PRASHANTH MOTUPALLI";
	public static final Integer MINIMUM_BALANCE =1000;
	public static final String BANK_NAME ="PRASHANTH MOTUPALLI";
	public static final String ACCOUNT_BALANCE = "";



	

	 void m1();
	 
}

interface Interface2{
	void m1();
	
}

class MyClass implements Interface1,Interface2{

	public void m1() {
		System.out.println("Default method implementation of both interfaces");
		
	}
	
}
public class InterfaceExample extends MyClass {
	public static void main(String[] args) {
		InterfaceExample ie= new InterfaceExample();
		ie.m1();
	}

	
}
