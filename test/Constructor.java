package test;

/*In Inheritance child class object will call both parent and child constructor 
this keyword used to call ---current class constructor
super keyword used to call --- parent class constructor */
class A {

	A() {
		System.out.println("A  Constructor ");

	}

	A(int n){
		System.out.println("A Parameterized constructor");
	}

}

class B extends A {
	B() {
		System.out.println("B Constructor");

	}

	B(int n) {
		super(n);
		System.out.println("B Parameterized constructor");
	}

}

public class Constructor {
	public static void main(String[] args) {

		B b = new B(5);

	}
}
