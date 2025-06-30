public class ThisKeyword {
    private int value;
    public ThisKeyword(int value) {
        this.value = value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void displayValue() {
        System.out.println("Value: " + value);
    }
    public static void main(String[] args) {
        ThisKeyword myObject = new ThisKeyword(10);
        myObject.displayValue();
        myObject.setValue(20);
        myObject.displayValue();
    }
}