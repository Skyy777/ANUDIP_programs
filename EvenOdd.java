import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
