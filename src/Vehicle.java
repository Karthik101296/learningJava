// Defining an abstract class

public abstract class Vehicle {
    private String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method (no implementation)
    public abstract void startEngine();

    // Concrete method
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
