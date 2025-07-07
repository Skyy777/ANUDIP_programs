import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        printArmstrongNumber(start, end);   
        scanner.close();
    }
    public static void printArmstrongNumber(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");   
        for (int number = start; number <= end; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += cube(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }
    public static int cube(int digit) {
        int result = 0;
        for (int i = 0; i < 3; i++) {
            result += digit * digit * digit;
        }
        return result;
    }
}