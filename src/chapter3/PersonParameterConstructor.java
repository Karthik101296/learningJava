
public class PersonParameterConstructor {

    String name, state;
    int age;

    public PersonParameterConstructor(String name, int age, String state) {
        this.name = name;
        this.age = age;
        this.state = state;
    }

    public static void main(String[] args) {
        PersonParameterConstructor person = new PersonParameterConstructor("John", 30, "Karnataka"); // Calls the parameterized constructor 
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("State: " + person.state);
    }
}
