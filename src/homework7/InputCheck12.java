package homework7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class InputCheck12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        if (Character.isLetter(input)) {
            System.out.println("It's an alphabet.");
        } else if (Character.isDigit(input)) {
            System.out.println("It's a number.");
        } else {
            System.out.println("It's a symbol.");
        }
    }

}
