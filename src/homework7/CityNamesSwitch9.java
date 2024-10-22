package homework7;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */

public class CityNamesSwitch9 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        //user to enter an alphabet between A and F
        System.out.print("Enter an alphabet (A-F): ");
        char alphabet = scanner.next().charAt(0);

        // Using switch statement to determine the city name

        switch (alphabet) {
            case 'A':
                System.out.println("City: Ahmedabad");
                break;
            case 'B':
                System.out.println("City: Bhuj");
                break;
            case 'C':
                System.out.println("City: Chennai");
                break;
            case 'D':
                System.out.println("City: Delhi");
                break;
            case 'E':
                System.out.println("City: Etawah");
                break;
            case 'F':
                System.out.println("City: Faizabad");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }



}
