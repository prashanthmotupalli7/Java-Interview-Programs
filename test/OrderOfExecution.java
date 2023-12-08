package test;
public class OrderOfExecution {

    // Static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Hello, I am static!";

    // Instance variables
    int instanceVar1;
    String instanceVar2;

    // Static block (executed when the class is loaded)
    static {
        System.out.println("Static block: Executed when the class is loaded.");
    }

    // Instance block (executed when an object is created)
    {
        System.out.println("Instance block: Executed when an object is created.");
    }

    // Constructor
    public OrderOfExecution(int instanceVar1, String instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
        System.out.println("Constructor: Object created with values - " + instanceVar1 + ", " + instanceVar2);
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method: I am a static method.");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method: I am an instance method.");
        System.out.println("Instance variables: " + instanceVar1 + ", " + instanceVar2);
    }

    // Another static method
    static void anotherStaticMethod() {
        System.out.println("Another static method: I am another static method.");
    }

    public static void main(String[] args) {
        // Accessing static variables and methods
        System.out.println("Accessing static variables and methods:");
        System.out.println("StaticVar1: " + staticVar1);
        System.out.println("StaticVar2: " + staticVar2);
        staticMethod();
        anotherStaticMethod();

        // Creating an object (invokes instance block and constructor)
        OrderOfExecution obj = new OrderOfExecution(20, "InstanceVariable");

        // Accessing instance variables and methods through the object
        System.out.println("\nAccessing instance variables and methods:");
        obj.instanceMethod();
    }
}
