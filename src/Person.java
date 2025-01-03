public class Person {

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
        System.out.println("Hello, my name is " + name);
    }

    public void walk() {
        System.out.println(name + " is walking.");
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
