public class Setter {
    private String title;
    private String author;
    private double price;
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }
    public static void main(String[] args) {
        Setter setter = new Setter();
        setter.setTitle("To Kill a Mockingbird");
        setter.setAuthor("Harper Lee");
        setter.setPrice(12.99);
        setter.setPrice(-5.0);
    }
}