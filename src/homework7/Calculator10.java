package homework7;

import java.util.Scanner;

/**
 * Calculator using symbols
 */

public class Calculator10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input: operator
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);


        //calculation based on operator

        if (operation == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operation == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operation");
        }
    }


}
