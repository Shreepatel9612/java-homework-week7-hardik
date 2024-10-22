package homework7;

import java.util.Scanner;

/**
 *  Java Program to Check if a Number is Odd or Even
 */
public class OddOrEven6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + "is even.");
        }else {
            System.out.println(number + "is odd.");
        }
    }

}
