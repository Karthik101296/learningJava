public class Patterns {
    public static void hallowPrintPattern(int n) {

        for(int i=0; i < n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void trianglePrintPattern(int n) {

        for (int i = 0; i <= n; i++) {
            // inner loop to print space
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for (int j = 0; j <= i; j++) {
                System.out.print(i + " ");
            }
            // print new line for each row
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hallowPrintPattern(6);
        trianglePrintPattern(5);
    }
}
