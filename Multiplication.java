public class Multiplication {
    private int a = 5;
    private int b = 10;
    public void multiply() {
        int result = a * b;
        System.out.println("The result of multiplication is: " + result);
    }
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.multiply();
    }
}
//without argument