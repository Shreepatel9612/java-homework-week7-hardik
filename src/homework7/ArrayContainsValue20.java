package homework7;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class ArrayContainsValue20 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Ask for the specific value to search
        System.out.print("Enter the value to search for: ");
        int valueToFind = scanner.nextInt();

        // Variable to track if the value is found
        boolean found = false;

        // Check if the array contains the specific value
        for (int i = 0; i < size; i++) {
            if (array[i] == valueToFind) {
                found = true;
                break;
            }
        }

        // Output whether the value was found or not
        if (found) {
            System.out.println("The array contains the value " + valueToFind);
        } else {
            System.out.println("The array does not contain the value " + valueToFind);
        }

        // Close the scanner
        scanner.close();
    }
}
