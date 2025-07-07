import java.util.InputMismatchException;
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();
                System.out.println("Your age is " + age + ".");
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
