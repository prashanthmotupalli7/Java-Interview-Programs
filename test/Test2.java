package test;


class Animal {
    // Base class method
    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    // Method overriding
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
    void eat() {
    	System.out.println("the dog is eating");
    }
}

class Cat extends Animal {
    // Method overriding
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}


public class Test2 {
    public static void main(String[] args) {
    	
        Animal dog = new Dog();
        Animal cat = new Cat();
        Dog d=new Dog();
        dog.sound();  // Calls the overridden method in Dog
        cat.sound();  // Calls the overridden method in Cat
        d.eat();
    }
}