public class ImmutableStudent {
    // Private attributes (final to enforce immutability)
    private final String name;
    private final int age;
    private final String studentId;

    // Constructor to initialize all fields
    public ImmutableStudent(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    // No setters or any methods that modify state!
}
