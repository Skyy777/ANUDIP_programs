class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
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
