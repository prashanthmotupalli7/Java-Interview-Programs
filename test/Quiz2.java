package test;

public class Quiz2 {
	static {
		System.out.println("SB");
	}

	Quiz2() {
		System.out.println("CB");
	}

	{
		System.out.println("IB");
	}

	public static void main(String[] args) {
		// Quiz2 q = new Quiz2();
	}
}
