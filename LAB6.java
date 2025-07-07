//// LAB 6 PROG 1
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
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        Garage myGarage = new Garage();
        myGarage.serviceVehicle(myCar);
        myGarage.serviceVehicle(myMotorcycle);
    }
}



///LAB 6 PROG 2

class Student {
    String name;
    int age;
    String department;
    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Student(int age, String department, String name) {
        this.age = age;
        this.department = department;
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}
public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice", 22); 
        Student student3 = new Student("Bob", 21, "Mathematics");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}