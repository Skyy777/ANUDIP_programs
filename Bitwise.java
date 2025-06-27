public class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int andResult = a & b;
        System.out.println("a & b = " + andResult);
        int orResult = a | b;
        System.out.println("a | b = " + orResult);
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + xorResult);
        int notResult = ~a;
        System.out.println("~a = " + notResult);
    }
}
