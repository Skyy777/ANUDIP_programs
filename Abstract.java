// ...existing code...
class Cat extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Meow");
    }
}

// Main class to test the abstract class and its subclasses
public class Abstract {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        dog.eat();

        cat.sound();
        cat.eat();
    }
}