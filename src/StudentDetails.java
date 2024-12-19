
class Student extends Person {

    private String studentID;

    // Constructor
    public Student(String name, int age, String studentID) {
        super(name, age); // Calling the constructor of the superclass(Person) 
        this.studentID = studentID;
    }

    // Additional behavior specific to Student
    public void study() {
        System.out.println(getName() + " is studying.");
    }
    public void studentID() {
        System.out.println(getStudentID() + " is my Student ID.");
    }

    // Getter and Setter for studentID
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}

public class StudentDetails {

public static void main(String[] args) {
    // Creating an object of the Student class
    Student student1 = new Student("Trio", 29, "S12345");
    // Using inherited methods
    student1.speak(); // Outputs: Hello, my name is Trio
    student1.walk(); // Outputs: Trio is walking.
    // Using subclass-specific method
    student1.study(); // Outputs: Trio is studying.
    student1.studentID(); // Outputs: S12345 is my Student ID.
    }
}