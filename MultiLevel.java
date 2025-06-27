class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();
        myPuppy.bark();
        myPuppy.weep();
    }
}