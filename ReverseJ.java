public class ReverseJ {
    public static void main(String[] args) {
        int rows = 5;
        System.out.println("Left-Aligned Reverse Pyramid:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("J ");
            }
            System.out.println();
        }
    }
}
