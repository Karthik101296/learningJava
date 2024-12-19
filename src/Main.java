
public class Main {

    public static void main(String[] args) {
        // Creating a Person object
        Person person1 = new Person("Alice", 30);
        // Accessing and modifying private attributes using public methods
        person1.setName("John");
        person1.setAge(31);
        System.out.println(person1.getName() + " is " + person1.getAge()
                + " years old.");
        // Direct access to private attributes (uncommenting will cause an error)
        // person1.name = "Bob"; // Error: name has private access in Person
    }
}
