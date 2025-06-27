class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}
class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking.");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk();
    }
}