public class StarPatterns {
    public static void main(String[] args) {
        int pyramidRows = 5;
        int squareSize = 5;
        System.out.println("Star Pyramid:");
        printPyramid(pyramidRows);
        System.out.println("\n\nStar Square:");
        printSquare(squareSize);
    }
    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}