package homework7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class CityName8 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an alphabet between A and F
        System.out.print("Enter an alphabet (A-F): ");
        char alphabet = scanner.next().charAt(0);

        // Check the input alphabet using if-else statements
        if (alphabet == 'A') {
            System.out.println("City: Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("City: Bhuj");
        } else if (alphabet == 'C') {
            System.out.println("City: Chennai");
        } else if (alphabet == 'D') {
            System.out.println("City: Delhi");
        } else if (alphabet == 'E') {
            System.out.println("City: Etawah");
        } else if (alphabet == 'F') {
            System.out.println("City: Faizabad");
        } else {
            System.out.println("Invalid entry");
        }

        // Close the scanner
        scanner.close();
    }


}
