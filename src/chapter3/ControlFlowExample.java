
public class ControlFlowExample {

    public static void main(String[] args) {
        // Conditional statements
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // Looping statements
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration: " + i);
        }
        
        // Jump statements
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("i = " + i);
        }
    }
}
