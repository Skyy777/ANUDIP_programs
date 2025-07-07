// Student class
class Student {
    // Instance variables
    String name;
    int age;
    String department;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    // Constructor with name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT"; // Default department
    }

    // Constructor with name, age, and department
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

// Main class
public class MainStudent {
    public static void main(String[] args) {
        // Create instances of Student using each constructor
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("Alice", 22); // Constructor with name and age
        Student student3 = new Student("Bob", 21, "Mathematics"); // Constructor with all parameters
        
        // Display student information
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}
