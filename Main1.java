import java.util.Scanner;
class Car {
    private String make;
    private String model;
    private short year;
    private int price;
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void display() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: $" + price);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car year: ");
        short year = scanner.nextShort();
        System.out.print("Enter car price: ");
        int price = scanner.nextInt();
        Car car = new Car(make, model, year, price);
        System.out.println("\nCar Details:");
        car.display();
        scanner.close();
    }
}