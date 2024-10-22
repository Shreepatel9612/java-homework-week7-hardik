package homework7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class SortArray17 {
    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {5, 2, 9, 1, 6, 3};

        // String array
        String[] strings = {"Banana", "Apple", "Mango", "Cherry", "Orange"};

        // Sorting the numeric array
        Arrays.sort(numbers);

        // Sorting the string array
        Arrays.sort(strings);

        // Display the sorted numeric array
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numbers));

        // Display the sorted string array
        System.out.println("Sorted String Array: " + Arrays.toString(strings));
    }
}

