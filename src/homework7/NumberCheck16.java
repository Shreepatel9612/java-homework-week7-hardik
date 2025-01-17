package homework7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class NumberCheck16 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The number is NEGATIVE.");
        } else {
            System.out.println("The number is ZERO.");
        }

        // Close the scanner
        scanner.close();
    }
}

