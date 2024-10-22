package homework7;
/**
 * Write a java program that tells us that Input number is odd or even?
 */

import java.util.Scanner;

public class TernaryOperator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();

        // Using ternary operator to check if the number is even or odd
        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("The Number is " + result);
    }
}
