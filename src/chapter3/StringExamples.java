
public class StringExamples {

    public static void main(String[] args) {
        String greeting = "Hello, World!";

        // String length
        System.out.println("Length: " + greeting.length());

        // Substring
        System.out.println("Substring: " + greeting.substring(0, 5));

        // Concatenation
        String fullGreeting = greeting + " Welcome to Java!";
        System.out.println("Concatenated String: " + fullGreeting);

        // Replace
        String newGreeting = greeting.replace("World", "Java");
        System.out.println("Replaced String: " + newGreeting);
        
        // Equality check
        boolean isEqual = greeting.equals("Hello, World!");
        System.out.println("Is equal: " + isEqual);
    }
}
