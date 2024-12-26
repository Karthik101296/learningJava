
public class Car1 extends Vehicle {
    public Car1(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting.");
    }
}
