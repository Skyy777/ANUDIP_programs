public class OneDimensionalArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println("Using enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}