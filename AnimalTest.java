class Animal {
    String type;
    public Animal(String type) {
        this.type = type;
    }
}
class Dog extends Animal {
    String name;
    public Dog(String name) {
        super("Dog");
        this.name = name;
    }
    public Dog() {
        this("Unknown");
    }
    public void bark() {
        System.out.println(name + " says Woof!");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog();
        dog1.bark();
        dog2.bark();
    }
}