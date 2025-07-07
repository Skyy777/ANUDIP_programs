import java.util.Scanner;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        System.out.println("Sum of two integers: " + calculator.add(int1, int2));
        System.out.print("Enter third integer: ");
        int int3 = scanner.nextInt();
        System.out.println("Sum of three integers: " + calculator.add(int1, int2, int3));
        System.out.print("Enter first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + calculator.add(double1, double2));
        scanner.close();
    }
}