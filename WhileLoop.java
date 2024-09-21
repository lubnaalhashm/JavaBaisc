
    import java.util.Scanner;

    public class WhileLoop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number;

            // Initialize the loop
            while (true) {
                System.out.print("Enter a positive number: ");
                number = scanner.nextInt();

                // Check if the entered number is negative
                if (number < 0) {
                    System.out.println(" Exiting...");
                    break; // Exit the loop
                }
            }

            scanner.close(); // Close the scanner
        }
    }


