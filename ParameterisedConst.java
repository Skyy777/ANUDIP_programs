public class ParameterisedConst {
    private int value;
    public ParameterisedConst(int value) {
        this.value = value;
    }
    public void displayValue() {
        System.out.println("Value: " + value);
    }
    public static void main(String[] args) {
        ParameterisedConst myObject = new ParameterisedConst(15);
        myObject.displayValue();
    }
}