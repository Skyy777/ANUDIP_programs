class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}
class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}
class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}
public class Main3 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        Garage myGarage = new Garage();
        myGarage.serviceVehicle(myCar);
        myGarage.serviceVehicle(myMotorcycle);
    }
}