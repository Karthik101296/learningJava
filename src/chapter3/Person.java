
public class Person {

    String name, country;
    int age;

    // Default constructor
    public Person() {
        this.name = "Jhon";
        this.age = 25;
        this.country = "India";
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Calls the default constructor
        Person person1 = new Person(); 

        // Calls the parameterized constructor 
        Person person2 = new Person("Karthik", 28); 

        System.out.println("Person1 - Name: " + person1.name + ", Age: " + person1.age + ", Country: " + person1.country);
        System.out.println("Person1 - " + person1); // output - Person@53d8d10a --- why?
        System.out.println("Person2 - Name: " + person2.name + ", Age: " + person2.age);
    }
}
