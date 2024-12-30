
public class DataTypesExample {

    public static void main(String[] args) {
        //Declaration and initialization of variables
        int myInt = 25;
        double myDouble = 12.34;
        char myChar = 'K';
        boolean myBoolean = true;
        
        //Printing the values
        System.out.println("Integer value - " + myInt);
        System.out.println("Double value - " + myDouble);
        System.out.println("Character value - " + myChar);
        System.out.println("Boolean value - " + myBoolean);

        //Implicit casting
        double newDouble = myInt;
        System.out.println("Implicitly casted double value: " + newDouble);

        //Explict casting
        int newInt = (int)myDouble;
        System.out.println("Explicitly casted int value: " + newInt);

        final int Val = (int)7.8;
        System.out.println("Explicitly casted int value: " + Val);

        // Using constants
        final double PI = 3.14159;
        System.out.println("Constant PI: " + PI);
    }
}
