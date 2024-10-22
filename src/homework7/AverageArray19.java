package homework7;

import java.util.Scanner;

/**
 * Write a Java program to calculate the average value of array elements.
 */

public class AverageArray19 {
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

        // Variable to store the sum of elements
        int sum = 0;

        // Calculate the sum of array elements
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Calculate the average
        double average = (double) sum / size;

        // Output the average
        System.out.println("The average of the array elements is: " + average);

        // Close the scanner
        scanner.close();
    }
}
