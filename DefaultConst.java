public class DefaultConst {
    private int value;
    public DefaultConst() {
        this.value = 10;
    }
    public void displayValue() {
        System.out.println("Value: " + value);
    }
    public static void main(String[] args) {
        DefaultConst myObject = new DefaultConst();
        myObject.displayValue();
    }
}