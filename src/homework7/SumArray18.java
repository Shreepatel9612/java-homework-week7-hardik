package homework7;
/**
 * Write a Java program to sum values of an array.
 */

import java.util.Scanner;

public class SumArray18 {
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

        // Variable to store the sum
        int sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Output the sum
        System.out.println("The sum of the array elements is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
