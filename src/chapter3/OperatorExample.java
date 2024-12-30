
public class OperatorExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic operations
        int sum = a + b; // sum = 15
        int difference = a - b; // difference = 5
        int product = a * b; // product = 50
        int quotient = a / b; // quotient = 2
        int remainder = a % b; // remainder = 0

        // Comparison operations
        boolean isEqual = (a == b); // isEqual = false
        boolean isGreater = (a > b); // isGreater = true

        // Logical operations
        boolean andResult = (a > b) && (b > 2); // andResult = true
        boolean orResult = (a > b) || (b > 10); // orResult = true
        boolean notResult = !(a > b); // notResult = false

        // Increment and Decrement
        int c = ++a; // c = 11, a = 11 (prefix increment)
        int d = b--; // d = 5, b = 4 (postfix decrement)
        
        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);
        System.out.println("Prefix Increment: " + c);
        System.out.println("Postfix Decrement: " + d);
    }
}
