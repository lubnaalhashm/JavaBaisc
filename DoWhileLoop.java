import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int S = 0;

        do {
            System.out.print("Enter a positive integer : ");
            number = scanner.nextInt();

            // Check if the number is positive
            if (number > 0) {
                S += number; // Add the number to the sum
            }
        } while (number != 0); // Continue until the user enters 0

        System.out.println("The sum of the entered positive numbers is: " + S);
        scanner.close(); // Close the scanner
    }
}
