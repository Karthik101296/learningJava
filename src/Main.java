
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
        //person1.name = "Bob"; // Error: name has private access in Person

        // Using polymorphism with the Movable interface
        Movable myCar = new Car();
        Movable myBicycle = new Bicycle();
        myCar.move(); // Outputs: The car is driving.
        myBicycle.move(); // Outputs: The bicycle is pedaling.

        Movable myBike = new Bike();
        myBike.move();

        // Creating an object of the Car class
        Car1 myNewCar = new Car1("Toyota");
        // Using methods from the abstract class and the subclass
        myNewCar.displayBrand(); // Outputs: Brand: Toyota
        myNewCar.startEngine(); // Outputs: The car's engine is starting.
    }
}
