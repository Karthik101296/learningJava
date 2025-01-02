
public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);

        // Modifying array elements
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // Iterating through the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": "
                    + numbers[i]);
        }

        // 2D array example
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements in a 2D array
        System.out.println("Element at row 1, column 2: " + matrix[0][1]);
        System.out.println("Element at row 2, column 2: " + matrix[1][2]);
        System.out.println("Element at row 3, column 1: " + matrix[2][1]);
        System.out.println(" matrix.length: " +  matrix.length);
        
        
        // Iterating through the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
