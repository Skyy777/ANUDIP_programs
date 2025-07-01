class Animal {
    String type;

    // Superclass constructor
    public Animal(String type) {
        this.type = type;
    }
}

class Dog extends Animal {
    String name;

    // Subclass constructor that calls the superclass constructor
    public Dog(String name) {
        super("Dog"); // Calls the Animal constructor
        this.name = name;
    }

    // Another constructor in the Dog class that uses constructor chaining
    public Dog() {
        this("Unknown"); // Calls the parameterized constructor
    }

    public void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy"); // Calls Dog(String name)
        Dog dog2 = new Dog(); // Calls Dog()

        dog1.bark(); // Output: Buddy says Woof!
        dog2.bark(); // Output: Unknown says Woof!
    }
}