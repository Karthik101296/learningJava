
class Person {
    // Attributes (State)
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Behaviors (Methods)
    public void speak() {
        System.out.println("Hello, my name is " + name + " and my age is " + age + ".");
    }
    public void walk() {
        System.out.println(name + " is walking.");
    }
    public void call() {
        System.out.println(name + " is calling...");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("John Doe", 25);
        // Using object methods
        person1.speak(); // Outputs: my name is John Doe and my age is 25.
        person1.walk(); // Outputs: John Doe is walking.
        person1.setName("Trio");
        person1.call();
    }
}
